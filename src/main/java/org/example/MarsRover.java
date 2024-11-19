package org.example;

public class MarsRover {
    private static int coordinateX = 0;
    private static int coordinateY = 0;
    private static int directionIndex = 0;
    private static final String[] Directions= {"N","E","S","W"};

    public String showStatus() {
            return coordinateX + ":" + coordinateY + ":" + Directions[directionIndex];
    }


    public String ChangeMarsRoverOriented(String command) {
        return null;
    }
}
