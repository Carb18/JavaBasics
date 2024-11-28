package FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1,3,4,5,6,7,8,11,22};
        for (int num: numeros){
            System.out.println("num = " + num);
        }

        String [] nombres = {"Camilo", "Andres","Pato","Hola"};

        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
