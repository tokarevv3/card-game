package com.cards;

import java.util.ArrayList;

public class Hand {
    private int cardCount;
    private final int playerId;
    private ArrayList<Card> cards;
    private final boolean isPlayer;

    private static final int PLAYER_NOT_BOT = 0;

    Hand(int playerId, boolean isPlayer) {
        this.playerId = playerId;
        this.isPlayer = isPlayer;
    }

    Hand(int playerId) {
        this.playerId = playerId;
        this.isPlayer = false;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void getBeat(Card card) {

    }
}
