package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class Sedan implements Cars{

  @Override
  public String getTypeOfCar() {
    return "Sedan";
  }

  @Override
  public String getTypeOfEngine() {
    return "V6";
  }
}
