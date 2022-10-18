package hangman;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Masz sześć prób na zgadnięcie słowa. Litera po literze");
        System.out.println();
        System.out.println("Wybrałem słowo. Zagrajmy w grę");
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay){
            System.out.println("Alright! Let's play!");
            Hangman game = new Hangman();
            do {
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
                System.out.println();
                // Get the guess
                System.out.println("podaj literę: ");
                char guess = (sc.next().toLowerCase().charAt(0));
                System.out.println();

                //Check if the character is guessed already
                while (game.isGuessedAlready(guess)){
                    System.out.println("Spróbuj ponownie! Już wybrałeś tę literę");
                    guess = (sc.next().toLowerCase().charAt(0));
                }

                if (game.playGuess(guess)){
                    System.out.println("Swietnie trafiłeś literę");
                } else {
                    System.out.println("Niestety pudło");
                }
                //Play the game

            }while (!game.gameOver());

            System.out.println();
            System.out.println("Chcesz zagrać ponownie");
            Character response = (sc.next().toUpperCase().charAt(0));
            doYouWantToPlay = (response == 'Y');
        }
    }
}
