package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 06.11.2022
 */
public class VolvoTruck implements Truck {

  @Override
  public void checkInfo() {
    System.out.println("You have created Volvo truck.");
  }
}
