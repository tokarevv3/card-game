package com.cards;

import java.util.ArrayList;

public class Hand {
    private int cardCount;
    private final int playerId;
    private ArrayList<Card> cards;

    Hand(int playerId) {
        this.playerId = playerId;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void getBeat(Card card) {

    }
}
