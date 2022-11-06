package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class ToyotaFactory implements AbstractFactory {

  public Sedan createSedan() {
    return new ToyotaSedan();
  }

  public Truck createTruck() {
    return new ToyotaTruck();
  }

}
