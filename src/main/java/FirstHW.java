public class FirstHW {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Square square = new Square(1);
        Rectangle rectangle = new Rectangle(1, 2);

        System.out.println(circle.getArea());
        System.out.println(square.getArea());
        System.out.println(rectangle.getArea());
    }
}