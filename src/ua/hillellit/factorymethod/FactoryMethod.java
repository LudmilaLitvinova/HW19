package ua.hillellit.factorymethod;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class FactoryMethod {

  public static void main(String[] args) {
    FurnitureMaker maker = getMakerByName("Chair");

    Furniture furniture = maker.createFurniture();
    furniture.produce();
  }

  public static FurnitureMaker getMakerByName(String maker) {
    if (maker.equalsIgnoreCase("sofa")) {
      return new SofaFurnitureMaker();
    } else if (maker.equalsIgnoreCase("chair")) {
      return new ChairFurnitureMaker();
    } else {
      throw new RuntimeException("There is no production line " + maker);
    }
  }
}
