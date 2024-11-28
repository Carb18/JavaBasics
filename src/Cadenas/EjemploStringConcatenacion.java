package Cadenas;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Camilo Ruiz";

        String detalle = curso + " con el instructor: " + profesor;
        System.out.println(detalle);


        int numeroA = 2;
        int numeroB = 15;

        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" con ") .concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}

