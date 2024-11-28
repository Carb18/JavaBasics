package Cadenas;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabaLenguas = "trabalenguas";
        System.out.println("trabaLenguas.length() = " + trabaLenguas.length());
        System.out.println("trabaLenguas.toCharArray() = " + trabaLenguas.toCharArray());

        char[] arreglo = trabaLenguas.toCharArray();

        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i =0; i< largo; i++) {
            System.out.println("arreglo = " + arreglo[i]);
            //System.out.print(+ arreglo[i]);
        }
        System.out.println("\ntrabaLenguas = " + trabaLenguas.split("a"));

        String[] arreglo2 = trabaLenguas.split("a");
        int l = arreglo2.length;
        for (int j=0; j<l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.xls";
        String[] archivoArr = archivo.split("\\.");
        //String[] archivoArr = archivo.split("[.]");
        l = archivoArr.length;
        for (int j=0; j<l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("Extension = " + archivoArr[l-1]);
    }
}

