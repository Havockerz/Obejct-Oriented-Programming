public class FruitTester {

  public static void main(String[] args) {
    CitrusFruit cf = new CitrusFruit("Orange", 20.3);
    Berry b = new Berry("Strawberry", 46.0);

//    System.out.println(cf); // Print CitrusFruit object details
    System.out.println("Orange nutritional value: " + cf.calculateNutritionalValue());

//    System.out.println(b); // Print Berry object details
    System.out.println("Strawberry nutritional value: " + b.calculateNutritionalValue());
  }
}
