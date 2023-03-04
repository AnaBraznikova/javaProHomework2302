import java.util.Random;

public abstract class Deck {

    // deck initialization
    public static void deckInitialization(String[] deck) {
        for (int i = 0; i < Rank.values().length; i++) {
            for (int j = 0; j < Suit.values().length; j++) {
                deck[Suit.values().length * i + j] = Rank.values()[i] + " " + Suit.values()[j];
            }
        }
    }

    // deck shuffling
    public static void deckShuffling(String[]deck, int numberOfCards){
    Random random = new Random();
    for (int i = 0; i < numberOfCards; i++) {
        int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
        String temp = deck[card];
        deck[card] = deck[i];
        deck[i] = temp;
    }
}
// the shuffled deck is displayed
    public static void deckIsDisplayed(int cardsForPlayer, int players, String[]deck){
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}


