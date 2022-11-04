package ua.hillellit.factorymethod;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class ChairFurnitureMaker implements FurnitureMaker{

  @Override
  public Furniture createFurniture() {
    return new Chair();
  }
}