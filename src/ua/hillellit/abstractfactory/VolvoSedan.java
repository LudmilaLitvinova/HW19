package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 06.11.2022
 */
public class VolvoSedan implements Sedan {

  @Override
  public void printInfo() {
    System.out.println("You have created Volvo sedan.");
  }
}
