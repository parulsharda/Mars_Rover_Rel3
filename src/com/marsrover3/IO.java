package com.marsrover3;

import java.util.Scanner;

public class IO {

    public String acceptInput() {
        Scanner sc = new Scanner(System.in);
        String plateauSize = sc.nextLine();
        return plateauSize;
    }


    public String acceptRoverPositionAndDirection()
    {
        Scanner sc = new Scanner(System.in);
        String roverPositionAndDirection = sc.nextLine();
        return roverPositionAndDirection;
    }

    public String direction()
    {
        Scanner sc = new Scanner(System.in);
        String direction = sc.nextLine();
        return direction;
    }
}

