package com.marsrover3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RoversPositionTest {
    @Test

    public void shouldGivePosition1and1() {

        IO io = new IO();
        RoversPosition rovers = new RoversPosition(io);

        int[] acceptedPositions = rovers.createRoversPositionAndDirection();

        assertArrayEquals(new int[]{1, 1}, acceptedPositions);
    }

    public void shouldGiveDirectionN() {

        IO io = new IO();
        RoversPosition rovers = new RoversPosition(io);

        char acceptedPositions = rovers.createPosition();

        assertEquals('N', acceptedPositions);
    }
}


