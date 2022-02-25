package org.example.inheritance.cards;

public interface Deck {

    void shuffle();

    void cut(int index);

    Card deal();

    Card turnOver();

    int search(Card card);

    void newOrder();

    int size();
}
