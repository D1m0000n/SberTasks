package Geometry;

import Geometry.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    public final Circle circleTest = new Circle(2);

    @Test
    void getArea() {
        double actualArea = circleTest.getArea();
        double expectedArea = Math.PI * 2 * 2;
        assertEquals(actualArea, expectedArea);
    }
}