package com.github.klawikowski.pieces;

import com.github.klawikowski.pieces.enums.Color;
import com.github.klawikowski.pieces.enums.Symbol;

abstract class Piece {
    private Color _color;
    private Symbol _symbol;

    public Piece(Color color, Symbol symbol) {
        this._color = color;
        this._symbol = symbol;
    }

    public Color getColor() {
        return _color;
    }

    public Symbol getSymbol() {
        return _symbol;
    }

    public void setColor(Color color) {
        this._color = color;
    }

    public void setSymbol(Symbol symbol) {
        this._symbol = symbol;
    }

    public abstract boolean isMoveValid(int startX, int startY, int endX, int endY);
}
