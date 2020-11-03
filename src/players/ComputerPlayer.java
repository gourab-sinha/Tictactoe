package players;

import games.Board;
import movestrategies.MoveStrategy;
import movestrategyfactory.MoveFactory;
import movestrategyfactory.MoveType;

public class ComputerPlayer extends Player{
    public ComputerPlayer(char symbol){
        super(symbol, MoveFactory.getMoveStrategy(MoveType.EasyMove));
    }

    @Override
    public void makeMove(Board board) {
        this.moveStrategy.makeMove(board, this.getSymbol());
    }
}
