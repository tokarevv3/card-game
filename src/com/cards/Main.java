package com.cards;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(true);
        deck.shuffle();

        Table table = new Table("Durak", 2, deck);

        var myHand = new Hand(0, true);

        table.addPlayer(myHand);

        table.startGame();
    }
}
