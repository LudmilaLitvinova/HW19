package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class FactoryProvider {

  AbstractFactory getToyotaFactory() {
    return new ToyotaFactory();
  }

  AbstractFactory getVolvoFactory() {
    return new VolvoFactory();
  }
}


