package ClasesWrapper;

import java.lang.reflect.Method;
import java.util.Arrays;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String text = "Hello there!";

        Class strClass = text.getClass();
        System.out.println("strClass.getName() =" + strClass.getName());
        System.out.println("strClass.getName() =" + strClass.getSimpleName());
        System.out.println("strClass.getName() =" + strClass.getPackageName());
        System.out.println("strClass.getName() =" + strClass);

        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
        Integer num =34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getPackage().getName() = " + intClass.getPackage().getName());
    }
}
