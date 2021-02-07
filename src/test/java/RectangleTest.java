import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    public final Rectangle rectangleTest = new Rectangle(2, 3);

    @Test
    void getArea() {
        double actualArea = rectangleTest.getArea();
        double expectedArea = 2.0 * 3;
        assertEquals(actualArea, expectedArea);
    }
}