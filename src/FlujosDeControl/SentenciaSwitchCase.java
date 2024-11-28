package FlujosDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        char num = '2';

        switch (num){
            case '0':
                System.out.println("El número es cero.");
                break;
            case '1':
                System.out.println("El número es uno.");
                break;
            case '2':
                System.out.println("El número es dos.");
                break;
            case '3':
                System.out.println("El número es tres");
                break;
            case '4':
                System.out.println("El número es cuatro");
                break;
            default:
                System.out.println("El número digitado es desconocido.");
        }

        String nombre ="camilo";

        switch (nombre){
            case "camilo":
                System.out.println("Bienvenido Camilo.");
                break;
            default:
                System.out.println("Nombre desconocido.");
        }
    }
}
