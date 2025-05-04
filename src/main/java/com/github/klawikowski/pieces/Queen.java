package com.github.klawikowski.pieces;

import com.github.klawikowski.pieces.enums.Color;
import com.github.klawikowski.pieces.enums.Symbol;

public class Queen extends Piece {
    public Queen(Color color, Symbol symbol) {
        super(color, symbol);
    }

    @Override
    public boolean isMoveValid(int startX, int startY, int endX, int endY) {
        int deltaX = Math.abs(endX - startX);
        int deltaY = Math.abs(endY - startY);

        return (startX == endX || startY == endY) || (deltaX == deltaY);
    }
}
