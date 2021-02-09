public class Rectangle extends Square {
    double other_side;

    public Rectangle(double side, double other_side) {
        super(side);
        this.other_side = other_side;
    }

    @Override
    public double getArea() {
        return side * other_side;
    }
}
