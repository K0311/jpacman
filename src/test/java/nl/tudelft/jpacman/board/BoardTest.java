package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

/**
 * Tests board construction and square lookup.
 */
class BoardTest {

    /**
     * Tests square lookup on a valid board.
     */
    @Test
    void testSquareAtValidBoard() {
        Square square = new BasicSquare();
        Square[][] grid = {{square}};

        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isSameAs(square);
    }

    /**
     * Tests rejection of a grid containing a null square.
     */
    @Test
    void testNullSquareRejected() {
        Square[][] grid = {{null}};

        assertThatThrownBy(() -> new Board(grid))
            .isInstanceOf(AssertionError.class)
            .hasMessage("Initial grid cannot contain null squares");
    }
}
