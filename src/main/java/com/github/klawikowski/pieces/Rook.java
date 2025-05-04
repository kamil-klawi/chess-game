package com.github.klawikowski.pieces;

import com.github.klawikowski.pieces.enums.Color;
import com.github.klawikowski.pieces.enums.Symbol;

public class Rook extends Piece {
    public Rook(Color color, Symbol symbol) {
        super(color, symbol);
    }

    @Override
    public boolean isMoveValid(int startX, int startY, int endX, int endY) {
        return startX == endX || startY == endY;
    }
}
