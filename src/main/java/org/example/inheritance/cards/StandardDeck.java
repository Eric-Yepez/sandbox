package org.example.inheritance.cards;

import java.util.*;

public class StandardDeck implements Deck {

    List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    public List<Card> getDeck() {
        return this.cards;
    }

    @Override
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
    }

    @Override
    public void cut(int index) {

        List<Card> top = new ArrayList<>();
        top.addAll(this.cards.subList(0, index));
        List<Card> bottom = new ArrayList<>();
        bottom.addAll(this.cards.subList(index, this.cards.size()));

        this.cards.clear();

        this.cards.addAll(bottom);
        this.cards.addAll(top);
    }

    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    @Override
    public Card turnOver() {
        return this.cards.get(0);
    }

    @Override
    public int search(Card card) {
        return this.cards.indexOf(card);
    }

    @Override
    public void newOrder() {
        Collections.sort(this.cards);
    }

    @Override
    public int size() {
        return this.cards.size();
    }

    private List<Card> newDeck() {

        List<Card> newDeck = new ArrayList<>() {
            @Override
            public String toString() {
                final StringJoiner joiner = new StringJoiner(",");
                joiner.add("Deck Size [" + this.size() + "]");
                this.stream()
                        .forEach(card -> {
                            joiner.add(card.toString());
                        });
                return joiner.toString();
            }
        };

        Arrays.stream(Suit.values())
                .forEach(suit -> {

                    Arrays.stream(FaceValue.values())
                            .map(faceValue -> new Card(suit, faceValue))
                            .forEach(newDeck::add);
                });
        return newDeck;
    }

    @Override
    public String toString(){
        return this.cards.toString();
    }
}
