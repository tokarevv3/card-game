package com.cards;

import java.util.HashMap;

public class Game {
    private HashMap<Integer, Hand> players;
    private final int playerCount;
    private int cardCount;
    private Deck deck;
    private Card cozur;


    Game(HashMap<Integer, Hand> players, Deck deck) {
        this.deck = deck;
        this.players = players;
        playerCount = players.size();
        this.cardCount = Table.getCardCount();
    }

    public void getCards(HashMap<Integer, Hand> players) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < playerCount; j++) {
                Hand player = players.get(j);
                player.addCard(deck.get());
            }
        }

    }

    public void run() {
        System.out.println("Starting new game  \"" + Table.getGameName() + "\".");

        while (deck.size() != 0) {
            // Процесс игры пока не закончатся карты в колоде
            // Игроки могут выбывать?
        }
        int playerCount = this.playerCount;
        while (playerCount != 1) {
            // Процесс игры пока не останется один игрок
            // Игроки выбывают
        }

    }

    public void setCozur(Card cozur) {
        this.cozur = cozur;
    }
}
