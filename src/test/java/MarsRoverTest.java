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

}
