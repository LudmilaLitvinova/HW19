package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class Van implements Cars {

  @Override
  public String getTypeOfCar() {
    return "Van";
  }

  @Override
  public String getTypeOfEngine() {
    return "V8";
  }
}
