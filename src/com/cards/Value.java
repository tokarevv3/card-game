package com.cards;

public enum Value {

    ACE (12),
    KING (11),
    QUEEN (10),
    JACK (9),
    TEN (8),
    NINE (7),
    EIGHT (6),
    SEVEN (5),
    SIX (4),
    FIVE (3),
    FOUR (2),
    THREE (1),
    TWO (0),
    JOKER (13);

    private final int value;

    Value(int value) {
        this.value = value;
    }

    /**
     * Method returns level of card value to comparison of values of card.
     * @see Card
     * @return integer value of card.
     */
    public int getValue() {
        return value;
    }

    /**
     *  Returns one of 12 values of card name.
     *  The jokers cannot be added by this method due it hard realization.
     *
     * @return the value of card.
     */
    public static Value random() {
        int value = ((int) (Math.random() * 12));
        return Value.values()[value];
    }
}
