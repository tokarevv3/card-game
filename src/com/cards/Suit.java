package com.cards;

public enum Suit {

    DIAMONDS,
    HEARTS,
    SPADES,
    CLUBS,
    BLACK,
    RED;

    /**
     *  Returns one of 4 values of card type.
     *  The jokers cannot be added by this method due it hard realization.
     *
     * @return the type of card.
     */
    public static Suit random() {
        int value = ((int) (Math.random() * 4));
        return Suit.values()[value];
    }
}
