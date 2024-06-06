public abstract class Fruit {
  private String name;

  public Fruit(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract double calculateNutritionalValue();

  @Override
  public String toString() {
    return "Fruit{" + "name='" + name + '\'' + '}';
  }
}

