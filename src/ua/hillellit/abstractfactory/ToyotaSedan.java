package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 06.11.2022
 */
public class ToyotaSedan implements Sedan {

  @Override
  public void printInfo() {
    System.out.println("You have created Toyota sedan.");
  }
}
