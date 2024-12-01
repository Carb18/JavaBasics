package SystemClass;

import java.util.HashMap;
import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("Usuario del sistema " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("Java home del sistema " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir del sistema " + temDir);

        String path = System.getenv("PATH");
        System.out.println("path del sistema " + path);

        String oneDrive = System.getenv("ONEDRIVE");
        System.out.println("oneDrive del sistema " + oneDrive);


    }
}
