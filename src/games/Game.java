package games;

import players.Player;
import winstrategies.WinningStrategy;

public class Game {
    private Player firstPlayer;
    private Player secondPlayer;
    private Board board;
    private WinningStrategy winningStrategy;
    private boolean playerTurn;

    public Game(Player firstPlayer, Player secondPlayer, Board board, WinningStrategy winningStrategy){
        this.firstPlayer=firstPlayer;
        this.secondPlayer=secondPlayer;
        this.board=board;
        this.winningStrategy=winningStrategy;
        this.playerTurn=true;
    }

    public void run(){
        int cell = board.getCol()* board.getCol();
        while(true){
            this.displayBoard(board);
            if(playerTurn){
                firstPlayer.makeMove(this.board);
                if(this.winningStrategy.getWinner(this.board)){
                    System.out.println("First Player Won!!");
                    return;
                }
            }
            else{
                secondPlayer.makeMove(this.board);
                if(this.winningStrategy.getWinner(this.board)){
                    System.out.println("Second Player Won!!");
                    return;
                }
            }
            playerTurn=!playerTurn;
            cell-=1;
            if(cell==0) break;
        }
        System.out.println("Draw!!!");
    }

    public void displayBoard(Board b){
        char[][] board = b.getBoard();
        int row=b.getRow();
        int col=b.getCol();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
}
