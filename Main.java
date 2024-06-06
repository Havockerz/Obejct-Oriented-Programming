public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle", 4, 3);
        Square square = new Square("Square", 6);

        System.out.println(triangle + " - Area = " + triangle.calculateArea());
        System.out.println(square + " - Area = " + square.calculateArea());
    }
}
