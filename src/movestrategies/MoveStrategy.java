package movestrategies;

import games.Board;
import players.Player;

public interface MoveStrategy {
    public void makeMove(Board board, char symbol);
}
