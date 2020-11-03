package winstrategies;

import games.Board;

public interface WinningStrategy {
    public boolean getWinner(Board b);
}
