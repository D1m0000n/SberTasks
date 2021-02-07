import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private final Square testSquare = new Square(2);

    @Test
    void getArea() {
        double actualArea = testSquare.getArea();
        double expectedArea = 4.0;
        assertEquals(actualArea, expectedArea);
    }
}