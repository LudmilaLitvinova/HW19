package ua.hillellit.factorymethod;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class Chair implements Furniture {

  @Override
  public void produce() {
    System.out.println("Production chair");
  }
}
