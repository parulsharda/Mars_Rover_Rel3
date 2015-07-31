package com.marsrover3;

public class Plateau {
    IO io;

    public Plateau(IO io) {
        this.io = io;
    }

    public int[] createPlateau() {
        String [] str = io.acceptInput().split(" ");
        int arrayInt[] = new int[str.length];
        for (int i = 0; i < str.length; i++)
          arrayInt[i]=Integer.valueOf(str[i]);
        //for(int i=0;i<arrayInt.length;i++)
        //System.out.print(arrayInt[i]);
        return arrayInt;
    }
}
