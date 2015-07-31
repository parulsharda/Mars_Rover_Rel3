package com.marsrover3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RoversTest {
    @Test

    public void shouldGivePosition1and1andDirectionN() {

        IO io = new IO();
        Rovers rovers = new Rovers(io);

        int[] acceptedPositions = rovers.createRoversPositionAndDirection();

        assertArrayEquals(new int[]{1, 1}, acceptedPositions);
    }
}


