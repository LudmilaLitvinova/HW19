package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public class Client {


  public static void main(String[] args) {
    FactoryProvider fp = new FactoryProvider();

    AbstractFactory toyotaFactory = fp.getToyotaFactory();
    Sedan sedanT = toyotaFactory.createSedan();
    Truck truckT = toyotaFactory.createTruck();
    sedanT.printInfo();
    truckT.checkInfo();

    AbstractFactory volvoFactory = fp.getVolvoFactory();
    Sedan sedanV = volvoFactory.createSedan();
    Truck truckV = volvoFactory.createTruck();
    sedanV.printInfo();
    truckV.checkInfo();
  }
}
