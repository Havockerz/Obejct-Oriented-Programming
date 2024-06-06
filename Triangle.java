public class Triangle extends GeometricShape {
    private int base;
    private int height;

    public Triangle(String shapeType, int base, int height) {
        super(shapeType);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
