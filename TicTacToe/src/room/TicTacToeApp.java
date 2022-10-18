package room;

import java.util.Scanner;

public class TicTacToeApp {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        boolean doYouWantToPlay = true;

        while (doYouWantToPlay) {
            System.out.println("Witam w kółko i krzyżyk \n Wybierz swój znak i znak AI");
            System.out.println("Wprowadź swój znak");
            char playerToken = sc.next().charAt(0);
            System.out.println("Wprowadź znak przeciwnika");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            Ai ai = new Ai();

            System.out.println();
            System.out.println("Zagrajmy. wprowadź numer 1-9 /n ");
            TicTacToe.printIndexBoard();
            System.out.println();

            while (game.gameOver().equals("Not over")){
                if (game.currentMarker == game.userMarker){
                    System.out.println("Twoja kolej");
                    int spot = sc.nextInt();
                    while (!game.playTurn(spot)){
                        System.out.println("Wpróbuj ponownie. " + spot + "jedst niewłasciwe. Zajęte // poza zakresem");
                        spot = sc.nextInt();
                    }
                    System.out.println("Wybrałeś " + spot + "!");
                } else {
                    System.out.println("Teraz MOJA kolej");
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("Wybrałem " + aiSpot + "!");
                }
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();

            /// new game
            System.out.println("Zagramy ponownie Y/N");
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y' || response == 'y');
            System.out.println();
            System.out.println();
        }
    }
}
