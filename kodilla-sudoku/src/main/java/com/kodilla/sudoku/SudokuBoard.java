package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private final List<SudokuRow> rows = new ArrayList<>();
    private final int size;

    public SudokuBoard(int size) {
        this.size = size;
        for (int i = 0; i < size; i ++) {
            rows.add(new SudokuRow(size));
        }
    }

    public List<SudokuRow> getRows() {
        return rows;
    }

    @Override
    public String toString() {
        StringBuilder board = new StringBuilder();
        for (SudokuRow row: rows){
            board.append(" -----".repeat(Math.max(0, size)));
            board.append("\n|");
            for (SudokuElement element: row.getElementsRow()){
                if(element.getValue() != -1){
                    board.append("  ");
                    board.append(element.getValue());
                    board.append("  ");
                }else{
                    board.append("     ");
                }
                board.append("|");
            }
            board.append("\n");
        }
        board.append(" -----".repeat(Math.max(0, size)));
        board.append("\n");
        return board.toString();
    }
}
