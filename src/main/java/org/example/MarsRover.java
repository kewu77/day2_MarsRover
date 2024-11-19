package org.example;

public class MarsRover {
    private static int coordinateX = 0;
    private static int coordinateY = 0;
    private static int directionIndex = 0;
    private static final String[] Directions= {"N","E","S","W"};

    public String showStatus() {
            return coordinateX + ":" + coordinateY + ":" + getDirection();
    }

    public String getDirection(){
        return directionIndex > 0 ? Directions[directionIndex % 4] : Directions[(directionIndex % 4 + 4) % 4];
    }

    public void ChangeMarsRoverOriented(String command) {
        if(command.equals("L")){
            directionIndex--;
        }
    }
}
