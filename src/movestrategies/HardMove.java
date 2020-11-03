package movestrategies;

import games.Board;

public class HardMove implements MoveStrategy{
    @Override
    public void makeMove(Board board, char symbol) {
        int row=board.getRow();
        int col=board.getCol();
        System.out.println(board);
    }
}
