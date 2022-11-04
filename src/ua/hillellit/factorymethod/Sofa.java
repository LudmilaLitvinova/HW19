package ua.hillellit.factorymethod;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class Sofa implements Furniture{

  @Override
  public void produce() {
    System.out.println("Producing sofa");
  }
}
