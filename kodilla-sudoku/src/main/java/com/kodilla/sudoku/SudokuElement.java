package com.kodilla.sudoku;

public class SudokuElement {

    public static Integer EMPTY = -1;
    public Integer value;

    public SudokuElement() {
        this.value = EMPTY;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return getValue().equals(EMPTY);
    }
}
