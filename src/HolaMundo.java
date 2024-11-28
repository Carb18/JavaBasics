
public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar.toUpperCase());
        int numero = 10;
        System.out.println("numero = " + numero);
        boolean valor = true;
        int numero2 = 5;

        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 20;
        }
        System.out.println("numero = " + numero2);
        // Variables dinámicas
        var numero3 = 12;
    }
}
