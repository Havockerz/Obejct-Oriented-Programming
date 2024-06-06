public class CitrusFruit extends Fruit {
  private double vitaminCContent;

  public CitrusFruit(String name, double vitaminCContent) {
    super(name);
    this.vitaminCContent = vitaminCContent;
  }

  @Override
  public double calculateNutritionalValue() {
    return 0.5 * vitaminCContent;
  }

//  @Override
//  public String toString() {
//    return "CitrusFruit{" + "name='" + getName() + '\'' + ", vitaminCContent=" + vitaminCContent + '}';
//  }
}
