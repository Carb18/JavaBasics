package SystemClass;

import java.io.IOException;
import java.sql.SQLOutput;

public class EjemploEjecutarProgramaOS {
    public static void main(String[] args) throws IOException {

        Runtime rt = Runtime.getRuntime();
        Process p;

        try{
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                p = rt.exec("notepad");
            } else {
                p =  rt.exec("gedit");
            }
            p.waitFor();
        } catch (IOException e) {
            System.err.println("Error al ejecutar el programa" + e.getMessage());
            System.exit(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Programa finalizado");
        System.exit(0);

    }
}
