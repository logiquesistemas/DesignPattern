package br.com.logique.padroes.nullobject;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class EmployeeFactory {

    public static final String[] names = {"Rob", "Joe", "Jack"};

    public static AbstractEmployee getEmployee(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new Programmer(name);
            }
        }
        return new NullEmployee();
    }

}
