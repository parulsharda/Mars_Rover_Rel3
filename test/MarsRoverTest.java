package com.marsrover3;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MarsRoverTest {
        MarsRover rover;

    @Test
    public void positionAndDirectionDoesNotChangeWhenRoverTurnsLeftAndRight() {
        rover = new MarsRover(1, 2, 'N');

        assertEquals(new MarsRover(1, 2, 'N'), rover.navigateTo("LR"));
        }

    @Test
    public void directionChangesToNorthWhenRoverTurnsRightFromWest() {
        rover = new MarsRover(0, 0, 'W');

        assertEquals(new MarsRover(0, 0, 'N'), rover.navigateTo("R"));
    }

}
