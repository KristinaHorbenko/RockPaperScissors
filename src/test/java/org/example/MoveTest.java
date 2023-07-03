package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveTest {

    @Test
    void compareMoves() {
        Move rock = Move.ROCK;
        Move paper = Move.PAPER;
        Move scissors = Move.SCISSORS;

        assertEquals(0, rock.compareMoves(rock));
        assertEquals(0, paper.compareMoves(paper));
        assertEquals(0, scissors.compareMoves(scissors));

        assertEquals(1, rock.compareMoves(scissors));
        assertEquals(-1, rock.compareMoves(paper));

        assertEquals(1, paper.compareMoves(rock));
        assertEquals(-1, paper.compareMoves(scissors));

        assertEquals(1, scissors.compareMoves(paper));
        assertEquals(-1, scissors.compareMoves(rock));
    }
}