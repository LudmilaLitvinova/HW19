package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class CarFactory implements AbstractFactory<Cars>{

  @Override
  public Cars create(String carType) {
    if ("Sedan".equalsIgnoreCase(carType)) {
      return new Sedan();
    }else if (("Van".equalsIgnoreCase(carType))) {
      return new Van();
    }else if ("Truck".equalsIgnoreCase(carType)){
      return new Truck();
    }else
    throw new RuntimeException("Oops");
    }

  }

