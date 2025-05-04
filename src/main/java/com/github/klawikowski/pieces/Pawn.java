package com.github.klawikowski.pieces;

import com.github.klawikowski.pieces.enums.Color;
import com.github.klawikowski.pieces.enums.Symbol;

public class Pawn extends Piece {
    public Pawn(Color color, Symbol symbol) {
        super(color, symbol);
    }

    private boolean isMoveForward(int startY, int endY) {
        return (getColor() == Color.WHITE && endY > startY) || (getColor() == Color.BLACK && endY < startY);
    }

    private boolean isStartingPosition(int startY) {
        return (getColor() == Color.WHITE && startY == 1) || (getColor() == Color.BLACK && startY == 6);
    }

    @Override
    public boolean isMoveValid(int startX, int startY, int endX, int endY) {
        int deltaX = Math.abs(endX - startX);
        int deltaY = Math.abs(endY - startY);

        if (deltaX == 0 && deltaY == 1 && isMoveForward(startY, endY)) {
            return true;
        }

        if (deltaX == 0 && deltaY == 2 && isMoveForward(startY, endY) && isStartingPosition(startY)) {
            return true;
        }

        if (deltaX == 1 && deltaY == 1 && isMoveForward(startY, endY)) {
            return true;
        }

        return false;
    }
}
