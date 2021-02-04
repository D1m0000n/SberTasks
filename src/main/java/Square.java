public class Square implements Figure{
    public Square(double side_) {
        side = side_;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    double side;
}
