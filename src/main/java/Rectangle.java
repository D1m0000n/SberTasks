public class Rectangle extends Square{
    public Rectangle(double side_, double other_side_) {
        super(side_);
        other_side = other_side_;
    }

    @Override
    public double getArea() {
        return side * other_side;
    }

    double other_side;
}
