package com.deckofcards.blackjack;

public interface Card {
    enum Suit{
        HEART,
        CLUB,
        DIAMOND,
        SPADE
    }
    enum Non_Number{
        KING,
        QUEEN,
        JACK,
        ACE,
    }
    enum Value{
        FACE,
        NUMBER,
        ANY,
    }
}
