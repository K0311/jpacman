package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests whether units correctly occupy squares.
 */
class OccupantTest {

    private Unit unit;

    /**
     * Creates a new unit before each test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Tests that a new unit has no square.
     */
    @Test
    void noStartSquare() {
        assertThat(unit.hasSquare()).isFalse();
    }

    /**
     * Tests occupation of a square.
     */
    @Test
    void testOccupy() {
        Square square = new BasicSquare();

        unit.occupy(square);

        assertThat(unit.hasSquare()).isTrue();
        assertThat(unit.getSquare()).isSameAs(square);
        assertThat(square.getOccupants()).contains(unit);
    }

    /**
     * Tests movement from one square to another.
     */
    @Test
    void testReoccupy() {
        Square firstSquare = new BasicSquare();
        Square secondSquare = new BasicSquare();

        unit.occupy(firstSquare);
        unit.occupy(secondSquare);

        assertThat(unit.hasSquare()).isTrue();
        assertThat(unit.getSquare()).isSameAs(secondSquare);
        assertThat(secondSquare.getOccupants()).contains(unit);
        assertThat(firstSquare.getOccupants()).doesNotContain(unit);
    }
}
