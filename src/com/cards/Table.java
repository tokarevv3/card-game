package com.cards;

import java.util.HashMap;

public class Table {
    private final int PLAYER_COUNT;
    private final String GAME_NAME;

    private int CARD_COUNT;
    private boolean ADDITIONAL;
    private int gameCards = CARD_COUNT;
    private boolean isAll;

    private HashMap<Hand, Integer> game;

    Table(String GAME_NAME, int PLAYER_COUNT) {
        if (PLAYER_COUNT < 2) {
            throw new IllegalArgumentException("Number of players must be 2 or more");
        }
        this.GAME_NAME = GAME_NAME;
        this.PLAYER_COUNT = PLAYER_COUNT;
        this.CARD_COUNT = 36; // Default game cards count
        this.ADDITIONAL = false;
        this.isAll = false; //
    }

    public Table additional(boolean ADDITIONAL) {
        this.ADDITIONAL = ADDITIONAL;
        return this;
    }

    public Table cardCount(int CARD_COUNT) {
        if (ADDITIONAL) {
        this.CARD_COUNT = CARD_COUNT;
        return this;
        } else {
            throw new IllegalStateException("Method cannot be called because additional is false.");
        }
    }

    public Table ktoPodbrasivaet(boolean isAll) {
        if (ADDITIONAL) {
            this.isAll = isAll;
            return this;
        } else {
            throw new IllegalStateException("Method cannot be called because additional is false.");
        }
    }

    public void startGame() {

    }
}
