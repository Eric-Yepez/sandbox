package org.example.inheritance.cards;

public class DeckDriver {

    public static void main(String[] args) {

        Deck cards = new StandardDeck();

        System.out.println("New Deck:");
        displayDeck(cards);

        cards.shuffle();
        System.out.println("Shuffled:");
        displayDeck(cards);

        System.out.println("Top card dealt:");
        System.out.println(cards.deal());

        System.out.println("Current deck state: ");
        displayDeck(cards);

        System.out.println("Top card diplayed: ");
        System.out.println(cards.turnOver());

        System.out.println("Current deck state: ");
        displayDeck(cards);

        System.out.println("Cut deck:");
        cards.cut(cards.size() / 2);
        displayDeck(cards);
    }

    public static void displayDeck(Deck cards) {
        System.out.println(cards);
        System.out.println();
    }
}
