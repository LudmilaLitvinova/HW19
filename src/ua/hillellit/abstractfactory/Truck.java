package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class Truck implements Cars{

  @Override
  public String getTypeOfCar() {
    return "Truck";
  }

  @Override
  public String getTypeOfEngine() {
    return "V12";
  }
}
