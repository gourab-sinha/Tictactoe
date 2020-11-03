package movestrategies;

import games.Board;

public class EasyMove implements MoveStrategy{
    @Override
    public void makeMove(Board b, char symbol) {
        int row=b.getRow();
        int col=b.getCol();
        char[][] board = b.getBoard();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='\u0000'){
                    board[i][j]=symbol;
                    return;
                }
            }
        }
    }
}
