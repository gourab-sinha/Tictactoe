package movestrategies;

import games.Board;
import players.Player;

import java.util.Scanner;

public class HumanMove implements MoveStrategy{

    private boolean checkBoundary(int x,int y, int row, int col){
        return !(x<0 || y<0 || x==row || y==col);
    }
    @Override
    public void makeMove(Board b, char symbol) {
        char[][] board = b.getBoard();
        int row=b.getRow();
        int col=b.getCol();
        Scanner sc=new Scanner(System.in);
        int x,y;
        while(true){
            System.out.println("Enter cell position: ");
            System.out.print("X: ");
            x=sc.nextInt();
            System.out.print("Y: ");
            y=sc.nextInt();
            if(checkBoundary(x,y,row,col) && board[x][y]=='\u0000'){
                board[x][y]=symbol;
                return;
            }
            System.out.println("You may have entered invalid position or already filled position");
        }
    }
}
