package winningstrategyfactory;

import games.Board;
import winstrategies.RowColDiagonal;
import winstrategies.WinningStrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyType winningStrategyType){
        switch (winningStrategyType){
            case RowColDiagonal:
                return new RowColDiagonal();
        }
        return null;
    }
}
