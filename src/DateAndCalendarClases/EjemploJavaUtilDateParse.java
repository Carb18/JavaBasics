package DateAndCalendarClases;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingrese una fecha con el formato dd-MM-yyyy");
        try {
            Date fecha = format.parse(entrada.next());
            System.out.println("fecha = " + fecha);
            System.out.println("sdf = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)) {
                System.out.println("Fecha1 (del usuario) es después que fecha 2 (actual)");
            } else if(fecha.before(fecha2)) {
                System.out.println("Fecha es anterior que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha es igual que fecha2");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha1 (del usuario) es después que fecha 2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es igual que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha es igual que fecha2");
            }

        } catch (ParseException e) {
            System.out.println("Error en el formato de fecha, verifique e intente de nuevo " + e);
        }

    }
}
