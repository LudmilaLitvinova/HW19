package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class Client {

  public static void main(String[] args) {
    CarFactory carFactory = new CarFactory();
    Cars sedan = carFactory.create("Sedan");
    Cars truck = carFactory.create("TrUcK");
    Cars van = carFactory.create("van");

    AbstractFactory<Color> colorFactory = new ColorFactory();
    Color red = colorFactory.create("rED");
    Color black = colorFactory.create("BlAcK");
    Color white = colorFactory.create("wHITE");

    System.out.println(sedan.getTypeOfCar());
    System.out.println(sedan.getTypeOfEngine());
    System.out.println(truck.getTypeOfCar());
    System.out.println(truck.getTypeOfEngine());
    System.out.println(van.getTypeOfCar());
    System.out.println(van.getTypeOfEngine());

    System.out.println(red.getColor());
    System.out.println(black.getColor());
    System.out.println(white.getColor());


  }
}
