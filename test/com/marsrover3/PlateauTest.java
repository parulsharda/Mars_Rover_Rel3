package com.marsrover3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class PlateauTest {

    @Test
    public void shouldMakePlateauOfSize5by5() {
        IO io = new IO();
        Plateau plateau = new Plateau(io);
        int[] acceptedSize = plateau.createPlateau();
        assertArrayEquals(new int[]{5, 5}, acceptedSize);
    }
}
