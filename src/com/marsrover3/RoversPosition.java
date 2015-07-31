package com.marsrover3;

public class RoversPosition {
    IO io = new IO();

    public RoversPosition(IO io) {
        this.io = io;
    }

    public int[] createRoversPositionAndDirection()
    {
        String [] str = io.acceptRoverPositionAndDirection().split(" ");
        int arrayInt[] = new int[str.length];
        for (int i = 0; i < str.length; i++)
            arrayInt[i]=Integer.valueOf(str[i]);
        /*for(int i=0;i<arrayInt.length;i++)
            System.out.print(arrayInt[i]);*/
        return arrayInt;
    }

    public char createPosition()
    {
       char position = io.acceptDirection();
       return position;
    }
}
