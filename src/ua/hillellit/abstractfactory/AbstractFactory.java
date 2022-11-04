package ua.hillellit.abstractfactory;

/**
 * @author Ludmila Litvinova on 04.11.2022
 */
public interface AbstractFactory<T>{
T create(String carType);
}
