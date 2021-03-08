package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private final List<SudokuElement> elementsRow;

    public SudokuRow(int countElements) {
        elementsRow = new ArrayList<>();
        for(int i = 0; i < countElements; i++) {
            elementsRow.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getElementsRow() {
        return elementsRow;
    }
}
