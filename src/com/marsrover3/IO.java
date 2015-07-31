package com.marsrover3;

import java.util.Scanner;

public class IO {

    public String acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        String plateauSize = sc.nextLine();
        return plateauSize;
    }
}
