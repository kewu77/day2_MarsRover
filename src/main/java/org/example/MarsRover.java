package org.example;

public class MarsRover {
    private static int coordinateX = 0;
    private static int coordinateY = 0;
    private static String direction = "N";

    public String showStatus() {
        return coordinateX + ":" + coordinateY + ":" + direction;
    }

    public String ChangeMarsRoverOriented(String command) {
        return null;
    }
}
