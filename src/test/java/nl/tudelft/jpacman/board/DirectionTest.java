package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Tests movement deltas for all four directions.
 */
public class DirectionTest {

    /**
     * Tests movement north.
     */
    @Test
    void testNorth() {
        Direction north = Direction.valueOf("NORTH");

        assertThat(north.getDeltaX()).isEqualTo(0);
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }

    /**
     * Tests movement south.
     */
    @Test
    void testSouth() {
        Direction south = Direction.valueOf("SOUTH");

        assertThat(south.getDeltaX()).isEqualTo(0);
        assertThat(south.getDeltaY()).isEqualTo(1);
    }

    /**
     * Tests movement east.
     */
    @Test
    void testEast() {
        Direction east = Direction.valueOf("EAST");

        assertThat(east.getDeltaX()).isEqualTo(1);
        assertThat(east.getDeltaY()).isEqualTo(0);
    }

    /**
     * Tests movement west.
     */
    @Test
    void testWest() {
        Direction west = Direction.valueOf("WEST");

        assertThat(west.getDeltaX()).isEqualTo(-1);
        assertThat(west.getDeltaY()).isEqualTo(0);
    }
}
