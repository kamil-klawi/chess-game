# BUILD

FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# OPTIMIZATION

FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/chess-game-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]