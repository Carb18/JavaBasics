package SystemClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try{
            FileInputStream file = new FileInputStream("src/config.properties");
            Properties prop = new Properties(System.getProperties());
            prop.load(file);
            prop.setProperty("my.custom.properties", "Test value");

            System.setProperties(prop);
            System.getProperties().list(System.out);

        } catch (IOException e) {
            System.out.println("No se encontró el archivo" + e);
        }
    }
}
