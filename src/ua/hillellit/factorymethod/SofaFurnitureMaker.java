package ua.hillellit.factorymethod;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class SofaFurnitureMaker implements FurnitureMaker {

  @Override
  public Furniture createFurniture() {
    return new Sofa();
  }
}

