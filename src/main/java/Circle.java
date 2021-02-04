public class Circle implements Figure {
    public Circle(int radius_) {
        radius = radius_;
    }

    @Override
    public double getArea() {
        double pi = 3.14;
        return pi * radius * radius;
    }

    int radius;
}
