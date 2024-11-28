package DateAndCalendarClases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);


        cal.set(2020,8,10);
        Date fecha = cal.getTime();
        cal.set(Calendar.YEAR,2023);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 20);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        String dateWithFormat = formato.format(fecha);
        System.out.println("dateWithFormat = " + dateWithFormat);

        Calendar cal2 = Calendar.getInstance();
        Date fecha2 = cal2.getTime();

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
    }
}
