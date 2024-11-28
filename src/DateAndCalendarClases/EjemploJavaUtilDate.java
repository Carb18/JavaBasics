package DateAndCalendarClases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date date1 = new Date();

        System.out.println("fecha = " + date1);

        // There is a standard for Date
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = df.format(date1);

        long j = 0;
        for (int i=0; i <10000000; i++){
            j +=i;
        }
        System.out.println("j = " + j);


        Date date2 = new Date();
        long finalTime = date2.getTime() - date1.getTime();
        System.out.println("Tiempo transcurrido en el for = " + finalTime);
        System.out.println("fechaString = " + fechaString);
    }
}
