package players;

import games.Board;
import movestrategies.MoveStrategy;
import movestrategyfactory.MoveFactory;
import movestrategyfactory.MoveType;
import users.User;

public class HumanPlayer extends Player{
    private User user;
    public HumanPlayer(char symbol){
        super(symbol, MoveFactory.getMoveStrategy(MoveType.HumanMove));
        System.out.println(this.getSymbol());
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public void makeMove(Board board) {
        this.moveStrategy.makeMove(board,this.getSymbol());
    }
}
