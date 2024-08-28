package com.cards;

import org.jetbrains.annotations.NotNull;

public class Card {
    private final Suit suit;
    private final Value value;
    private boolean isJoker;

    /**
     * Comparison of two Card. Returns in favor of the first Card.
     * @param card A card which this card is comparison.
     * @return boolean if cards are same.
     */
    public boolean isEquals(@NotNull Card card) {
        return card.suit == this.suit;
    }

    public boolean isEqualsValues(@NotNull Card card) {
        return card.value == this.value;
    }

    /**
     * Check if value of this card is strongest that value of second.
     * @param card A card which this card is trying to beat.
     * @return boolean if first card is stronger than second.
     */
    public boolean isBeat(@NotNull Card card) {
        if (isJoker) {
            if (card.value == Value.JOKER) {
                return false; // joker cannot beat joker
            }
            if (this.suit == Suit.BLACK) {
                return card.suit == Suit.CLUBS || card.suit == Suit.SPADES;
            } else {
                return card.suit != Suit.CLUBS && card.suit != Suit.SPADES;
            }
        }
        if (card.isEquals(this)) {
            return this.value.getValue() > card.value.getValue();
        }
        return false;
    }

    /**
     * Main method to initial card.
     * @param suit A suit of card, Enum parameter.
     * @see Suit
     * @param value A value of card, Enum parameter.
     * @see Value
     * @throws IllegalArgumentException if card contains elements of Joker card.
     */
    public Card(@NotNull Suit suit, @NotNull Value value) {
        if ((suit == Suit.BLACK || suit == Suit.RED) && (value != Value.JOKER)) {
            throw new IllegalArgumentException("Black and red only for joker cards");
        }
        if ((value == Value.JOKER) && (suit != Suit.BLACK && suit != Suit.RED)) {
            throw new IllegalArgumentException("Joker only for black and red cards");
        }
        if (value == Value.JOKER) {
            isJoker = true;
        }
        this.suit = suit;
        this.value = value;
    }

    // Jokers cannot appear in constructor without parameters

    /**
     * Create object of one Card without any parameters.
     * Then @Suit and @Value will be random value.
     * Joker cannot appear in this method.
     * @see Card
     * @see Suit
     * @see Value
     */
    public Card() {
        this.suit = Suit.random();
        this.value = Value.random();
    }

    @Override
    public String toString() {
        return "Suit: " + suit.toString() + ", value: " + value.toString();
    }
}
