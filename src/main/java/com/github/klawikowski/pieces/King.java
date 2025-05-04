package com.github.klawikowski.pieces;

import com.github.klawikowski.pieces.enums.Color;
import com.github.klawikowski.pieces.enums.Symbol;

public class King extends Piece {
    public King(Color color, Symbol symbol) {
        super(color, symbol);
    }

    @Override
    public boolean isMoveValid(int startX, int startY, int endX, int endY) {
        int deltaX = Math.abs(endX - startX);
        int deltaY = Math.abs(endY - startY);

        return (deltaX <= 1 && deltaY <= 1);
    }
}
