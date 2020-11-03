package winstrategies;

import games.Board;

public class RowColDiagonal implements WinningStrategy{

    @Override
    public boolean getWinner(Board b) {
        char[][] board = b.getBoard();
        int row=b.getRow();
        int col=b.getCol();
        for(int i=0;i<row;i++){
            int count = 1;
            for(int j=1;j<col;j++){
                if(board[i][j]==board[i][j-1] && board[i][j]!='\u0000' && board[i][j-1]!='\u0000'){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==col) return true;
        }
        for(int j=0;j<col;j++){
            int count=1;
            for(int i=1;i<row;i++){
                if(board[i][j]==board[i-1][j] && board[i][j]!='\u0000' && board[i-1][j]!='\u0000'){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==row) return true;
        }

        int count=1;
        for(int i=1;i<row;i++){
            if(board[i][i]==board[i-1][i-1]){
                count++;
            }

        }
        if(row==count) return true;

        count=1;
        for(int i=row-2;i>=0;i--){
            if(board[i][i]==board[i+1][i+1]){
                count++;
            }
        }
        return count==row;
    }
}
