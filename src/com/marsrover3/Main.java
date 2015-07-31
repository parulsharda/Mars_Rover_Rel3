package com.marsrover3;

import sun.rmi.server.Dispatcher;

public class Main {

    public static void main(String args[])
    {
        IO io = new IO();
        Plateau plateau = new Plateau(io);
        RoversPosition roversposition = new RoversPosition(io);
        plateau.createPlateau();
        int[] position = roversposition.createRoversPositionAndDirection();
        char dir = roversposition.createPosition();
        MarsRover rovers = new MarsRover(position[0],position[1],dir);
        rovers.navigateTo("L L R R M");


    }
}
