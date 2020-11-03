package gamefactory;

import games.Board;
import games.Game;
import movestrategies.MoveStrategy;
import movestrategyfactory.MoveFactory;
import movestrategyfactory.MoveType;
import playerfactory.PlayerFactory;
import playerfactory.PlayerType;
import players.Player;
import winningstrategyfactory.WinningStrategyFactory;
import winningstrategyfactory.WinningStrategyType;
import winstrategies.WinningStrategy;

import java.util.Scanner;

public class GameFactory {
    public static Game createGame(int row, int col, PlayerType firstPlayer, PlayerType secondPlayer){
        Player playerOne = PlayerFactory.getPlayer(firstPlayer,'x');
        Player playerTwo = PlayerFactory.getPlayer(secondPlayer,'o');
        Board board = new Board(row,col);
        WinningStrategy winningStrategy = WinningStrategyFactory.getWinningStrategy(WinningStrategyType.RowColDiagonal);
        return new Game(playerOne, playerTwo, board, winningStrategy);

    }
}
