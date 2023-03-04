import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {


        final int cardsForPlayer = 5;
        int players = 0;

        final Scanner sc = new Scanner(System.in);
        final Random random = new Random();


        final int numberOfCards = Suit.values().length * Rank.values().length; // number of cards
        String[] deck = new String[numberOfCards];


        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }


        Deck.deckInitialization(deck);
        Deck.deckShuffling(deck, numberOfCards);
        Deck.deckIsDisplayed(cardsForPlayer, players, deck);

    }
}

