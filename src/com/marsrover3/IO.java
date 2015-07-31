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

    public char acceptDirection()
    {
        Scanner sc = new Scanner(System.in);
        char direction = sc.next().charAt(0);
        return direction;
    }
}

