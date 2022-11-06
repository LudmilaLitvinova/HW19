package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 06.11.2022
 */
public class VolvoFactory implements AbstractFactory {

  public Sedan createSedan() {
    return new VolvoSedan();
  }

  public Truck createTruck() {
    return new VolvoTruck();
  }
}
