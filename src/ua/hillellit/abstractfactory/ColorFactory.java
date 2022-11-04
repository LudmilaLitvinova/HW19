package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class ColorFactory implements AbstractFactory<Color> {

  @Override
  public Color create(String carType) {
    if ("White".equalsIgnoreCase(carType)) {
      return new White();
    } else if ("Red".equalsIgnoreCase(carType)) {
      return new Red();
    } else if ("Black".equalsIgnoreCase(carType)) {
      return new Black();
    }
    throw new RuntimeException("Oops!!!");
  }
}
