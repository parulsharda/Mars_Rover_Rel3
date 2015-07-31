package com.marsrover3;

public class Rovers {
    IO io = new IO();

    public Rovers(IO io) {
        this.io = io;
    }

    public int[] createRoversPositionAndDirection()
    {
        String [] str = io.acceptRoverPositionAndDirection().split(" ");
        int arrayInt[] = new int[str.length-1];
        for (int i = 0; i < str.length; i++)
            arrayInt[i]=Integer.valueOf(str[i]);
        /*for(int i=0;i<arrayInt.length;i++)
            System.out.print(arrayInt[i]);*/
        return arrayInt;
    }
}
