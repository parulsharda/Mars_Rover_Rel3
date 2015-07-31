package com.marsrover3;

public class Main {

    public static void main(String args[])
    {
        IO io = new IO();
        Plateau plateau = new Plateau(io);
        Rovers rovers = new Rovers(io);
        plateau.createPlateau();
        plateau.createPlateau();
    }
}
