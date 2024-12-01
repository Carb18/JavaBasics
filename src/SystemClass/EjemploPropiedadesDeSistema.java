package SystemClass;

import javax.lang.model.SourceVersion;
import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        
        String nombre = System.getProperty("user.name");
        System.out.println("nombre = " + nombre);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);


        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.home");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator);

        System.out.println("LineSeparator " + lineSeparator + "New line");

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
