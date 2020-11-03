package movestrategyfactory;

import movestrategies.*;

public class MoveFactory {
    public static MoveStrategy getMoveStrategy(MoveType moveType){
        switch (moveType){
            case EasyMove:
                return new EasyMove();
            case MediumMove:
                return new MediumMove();
            case HardMove:
                return new HardMove();
            case HumanMove:
                return new HumanMove();
        }
        return null;
    }
}
