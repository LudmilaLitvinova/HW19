package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class FactoryProvider {
public static AbstractFactory getFactory(String choice){
  if ("Car".equalsIgnoreCase(choice)) {
    return new CarFactory();
  }
  else if ("Color".equalsIgnoreCase(choice)){
    return new ColorFactory();
  }
  throw new RuntimeException("Oops!!!");
  }
}

