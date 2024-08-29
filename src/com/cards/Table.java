package com.cards;

import java.util.HashMap;

public class Table {
    private final int PLAYER_COUNT;
    private static String GAME_NAME;

    private static int CARD_COUNT;

    private boolean ADDITIONAL;
    private int gameCards;
    private boolean isAll;
    private HashMap<Integer, Hand> game;
    private Deck deck;

    private final Card cozur;


    private int playerCount;
    {
        gameCards = CARD_COUNT;
    }


    Table(String GAME_NAME, int PLAYER_COUNT, Deck deck) {
        if (PLAYER_COUNT < 2) {
            throw new IllegalArgumentException("Number of players must be 2 or more");
        }
        this.deck = deck;
        Table.GAME_NAME = GAME_NAME;
        this.PLAYER_COUNT = PLAYER_COUNT;
        CARD_COUNT = 36; // Default game cards count
        this.ADDITIONAL = false;
        this.isAll = false; //
        cozur = deck.getCozur();
    }

    public Table additional(boolean ADDITIONAL) {
        this.ADDITIONAL = ADDITIONAL;
        return this;
    }

    public Table cardCount(int CARD_COUNT) {
        if (ADDITIONAL) {
            Table.CARD_COUNT = CARD_COUNT;
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

    public void addPlayer(Hand player) {
        if (playerCount < PLAYER_COUNT) {
            game.put(playerCount, player);
            playerCount++;
        } else {
            throw new IllegalArgumentException("Too much players cause of init.");
        }
    }

    public void addPlayer(int count) {
        if (count > PLAYER_COUNT) {
            throw new IllegalArgumentException("Too much players cause of init.");
        }
        if (count > PLAYER_COUNT - playerCount) {
            throw new IllegalArgumentException("Too much players cause of init.");
        }
        for (int i = 0; i < count; i++) {
            game.put((playerCount + i), new Hand(playerCount + i));
        }
        playerCount+=count;
    }

    public static int getCardCount() {
        return CARD_COUNT;
    }

    public static String getGameName() {
        return GAME_NAME;
    }

    public void startGame() {

        Game game = new Game(this.game,deck);
        game.getCards(this.game);
        game.setCozur(cozur);
        //game.run();
    }
}
