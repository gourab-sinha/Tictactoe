import gamefactory.GameFactory;
import games.Game;
import playerfactory.PlayerType;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Enter Board Dimensions Row and Col");
        Scanner sc = new Scanner(System.in);
        System.out.print("Row: ");
        int row = sc.nextInt();
        System.out.print("Col: ");
        int col = sc.nextInt();


        Game game = GameFactory.createGame(row,col,PlayerType.HumanPlayer,PlayerType.HumanPlayer);
        game.run();
    }
}
