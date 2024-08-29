package com.cards;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(true);
        deck.shuffle();
        System.out.println(deck);


        Card first = new Card(Suit.BLACK, Value.JOKER);
        Card second = new Card(Suit.SPADES, Value.ACE);
        System.out.println(first.isBeat(second));
        System.out.println(first.toString() + " " + second.toString());

        Table table = new Table("Durak", 2, new Deck(true))
                .additional(true)
                .cardCount(32);
    }
}
