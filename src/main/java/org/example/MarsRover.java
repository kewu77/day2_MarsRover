package org.example;

public class MarsRover {
    private int coordinateX = 0;
    private int coordinateY = 0;
    private int directionIndex = 0;
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
        }else if(command.equals("R")){
            directionIndex++;
        }
    }

    public void marsRoverMove(){
        String direction = getDirection();
        switch (direction) {
            case "N" -> coordinateY++;
            case "W" -> coordinateX--;
            case "S" -> coordinateY--;
            case "E" -> coordinateX++;
        }
    }

    public void marsRoverBack(){
        String direction = getDirection();
        switch (direction) {
            case "N" -> coordinateY--;
            case "W" -> coordinateX++;
            case "S" -> coordinateY++;
            case "E" -> coordinateX--;
        }
    }

    public void ChangeMarsRoverPosition(String command) {
        if(command.equals("M")){
            marsRoverMove();
        }else if(command.equals("B")){
            marsRoverBack();
        }
    }

    public void ChangeMarsRoverStatus(String commands) {

    }
}
