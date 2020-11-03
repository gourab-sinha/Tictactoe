package playerfactory;

import movestrategies.MoveStrategy;
import players.ComputerPlayer;
import players.HumanPlayer;
import players.Player;

public class PlayerFactory {
    public static Player getPlayer(PlayerType playerType,char symbol){
        switch (playerType){
            case HumanPlayer:
                return new HumanPlayer(symbol);
            case ComputerPlayer:
                return new ComputerPlayer(symbol);
        }
        return null;
    }
}
