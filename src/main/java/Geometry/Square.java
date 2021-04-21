package Geometry;

import Geometry.Figure;

public class Square implements Figure {
    protected final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
