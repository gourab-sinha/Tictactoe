package players;

import games.Board;
import movestrategies.MoveStrategy;
import movestrategyfactory.MoveFactory;

public abstract class Player {
    char symbol;
    MoveStrategy moveStrategy;

    public Player(char symbol, MoveStrategy moveStrategy){
        this.symbol=symbol;
        this.moveStrategy=moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public abstract void makeMove(Board board);

    public char getSymbol() {
        return symbol;
    }
}
