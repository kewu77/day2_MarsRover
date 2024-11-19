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
    void should_face_north_when_oriented_north_and_turn_left(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("L");
        rover.ChangeMarsRoverOriented("L");
        rover.ChangeMarsRoverOriented("L");
        rover.ChangeMarsRoverOriented("L");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:N",report);
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

    @Test
    void should_face_south_when_oriented_north_and_turn_right(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverOriented("R");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:S",report);
    }

    @Test
    void should_face_west_when_oriented_north_and_turn_right(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverOriented("R");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:W",report);
    }

    @Test
    void should_face_north_when_oriented_north_and_turn_right(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverOriented("R");
        String report = rover.showStatus();
        //Then
        assertEquals("0:0:N",report);
    }

    @Test
    void should_increase_y_coordinate_when_oriented_north_and_move(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverPosition("M");
        String report = rover.showStatus();
        //Then
        assertEquals("0:1:N",report);
    }

    @Test
    void should_decrease_y_coordinate_when_oriented_south_and_move(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverPosition("M");
        String report = rover.showStatus();
        //Then
        assertEquals("0:-1:S",report);
    }

    @Test
    void should_increase_x_coordinate_when_oriented_east_and_move(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverPosition("M");
        String report = rover.showStatus();
        //Then
        assertEquals("1:0:E",report);
    }

    @Test
    void should_decrease_x_coordinate_when_oriented_west_and_move(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("L");
        rover.ChangeMarsRoverPosition("M");
        String report = rover.showStatus();
        //Then
        assertEquals("-1:0:W",report);
    }


    @Test
    void should_decrease_y_coordinate_when_oriented_north_and_back(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverPosition("B");
        String report = rover.showStatus();
        //Then
        assertEquals("0:-1:N",report);
    }

    @Test
    void should_increase_y_coordinate_when_oriented_south_and_back(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverPosition("B");
        String report = rover.showStatus();
        //Then
        assertEquals("0:1:S",report);
    }

    @Test
    void should_decrease_x_coordinate_when_oriented_east_and_back(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("R");
        rover.ChangeMarsRoverPosition("B");
        String report = rover.showStatus();
        //Then
        assertEquals("-1:0:E",report);
    }

    @Test
    void should_increase_x_coordinate_when_oriented_west_and_back(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverOriented("L");
        rover.ChangeMarsRoverPosition("B");
        String report = rover.showStatus();
        //Then
        assertEquals("1:0:W",report);
    }

    @Test
    void should_move_to_true_position_when_execute_long_command(){
        // Given
        MarsRover rover = new MarsRover();
        // When
        rover.ChangeMarsRoverStatus("LBBL");
        String report = rover.showStatus();
        //Then
        assertEquals("2:0:S",report);
    }
}
