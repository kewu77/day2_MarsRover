import org.example.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    @Test
    void should_initialize_mars_rover() {
        // Given
        MarsRover rover = new MarsRover();
        // When
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:N",report);
    }

    @Test
    void should_face_west_when_oriented_north_and_turn_left(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("L");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:W",report);
    }

    @Test
    void should_face_south_when_oriented_north_and_turn_left(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("L");
        rover.ChangeMarsRoverOriented("L");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:S",report);
    }

    @Test
    void should_face_east_when_oriented_north_and_turn_left(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("L");
        rover.ChangeMarsRoverOriented("L");
        rover.ChangeMarsRoverOriented("L");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:E",report);
    }


    @Test
    void should_face_east_when_oriented_north_and_turn_right(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("R");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:E",report);
    }


}
