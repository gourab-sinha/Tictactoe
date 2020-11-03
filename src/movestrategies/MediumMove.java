package movestrategies;

import games.Board;

public class MediumMove implements MoveStrategy{
    @Override
    public void makeMove(Board board, char symbol) {
        int row=board.getRow();
        int col=board.getCol();

        System.out.println(board);
    }
}
