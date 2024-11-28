package Cadenas;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Camilo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase()" + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Camilo\") = " + nombre.equals("Camilo"));
        System.out.println("nombre.equals(\"Camilo\") = " + nombre.equals("camilo"));
        System.out.println("nombre.equalsIgnoreCase(\"Camilo\") = " + nombre.equalsIgnoreCase("Camilo"));
        System.out.println("nombre.compareTo(\"Camilo\") = " + nombre.compareTo("Camilo"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,6));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));


        String trabaLenguas = "trabalenguas";
        System.out.println("trabaLenguas = " + trabaLenguas.replace("a","."));
        System.out.println("trabaLenguas = " + trabaLenguas);
        System.out.println("trabaLenguas.indexOf('a') = " + trabaLenguas.indexOf('a'));
        System.out.println("trabaLenguas.lastIndexOf('a') = " + trabaLenguas.lastIndexOf('a'));
        System.out.println("trabaLenguas.contains(\"l\") = " + trabaLenguas.contains("k"));
        System.out.println("trabaLenguas.startsWith(\"traba\") = " + trabaLenguas.startsWith("traba"));
        System.out.println("trabaLenguas.endsWith(\"as\") = " + trabaLenguas.endsWith("as"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());


    }
}
