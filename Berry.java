public class Berry extends Fruit {
  private double antioxidantContent;

  public Berry(String name, double antioxidantContent) {
    super(name);
    this.antioxidantContent = antioxidantContent;
  }

  @Override
  public double calculateNutritionalValue() {
    return 0.9 * antioxidantContent;
  }

//  @Override
//  public String toString() {
//    return "Berry{" + "name='" + getName() + '\'' + ", antioxidantContent=" + antioxidantContent + '}';
//  }
}
