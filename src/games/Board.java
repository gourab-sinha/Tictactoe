package games;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private int row;
    private int col;
    private char[][] board;

    public Board(int row,int col){
        this.board = new char[row][col];
        this.row=row;
        this.col=col;
    }

    public char[][] getBoard() {
        return board;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
