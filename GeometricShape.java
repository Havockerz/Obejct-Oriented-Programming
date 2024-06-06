public abstract class GeometricShape {
    private String shapeType;

    public GeometricShape(String shapeType) {
        this.shapeType = shapeType;
    }

    public abstract double calculateArea();

    @Override
    public String toString() {
        return "Shape type: " + shapeType;
    }
}
