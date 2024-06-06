public class Square extends GeometricShape {
    private int length;

    public Square(String shapeType, int length) {
        super(shapeType);
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
}
