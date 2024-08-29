package com.cards;

import java.util.*;

public class Deck {
    private  ArrayDeque<Object> cards;
    private final boolean IS_BIG_DECK;
    private final int SIZE;

    public Deck(boolean isBigDeck) {
        this.IS_BIG_DECK = isBigDeck;

        if (isBigDeck) {
            SIZE = 64;
        } else {
            SIZE = 36;
        }
        cards = new ArrayDeque<>(SIZE);
        fill();
    }

    public void fill() {
        if (IS_BIG_DECK) {
            cards.add(new Card(Suit.BLACK, Value.JOKER));
            cards.add(new Card(Suit.RED, Value.JOKER));

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    cards.add(new Card(Suit.values()[i], Value.values()[j]));
                }
            }
        } else {
            for (Suit suit : Suit.values()) {
                for (int i = 0; i <= 8; i++) {
                    cards.add(new Card(suit, Value.values()[i]));
                }
            }
        }
    }

    public void shuffle() {
        var list = Arrays.asList(cards.toArray());
        Collections.shuffle(list);
        cards = new ArrayDeque<>(list);
    }

    public Card get() {
        return (Card) cards.poll();
    }

    public int size() {
        return cards.size();
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
