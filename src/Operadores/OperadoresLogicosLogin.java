package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
    /*
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Camilo";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "1234";

        usernames[2] = "admin2";
        passwords[2] = "12345";
    */
        String[] usernames = {"Camilo","admin","admin2"};
        String[] passwords = {"12345","1234","12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String u = scanner.next();
        System.out.println("Ingrese el password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i =0; i < usernames.length; i++){

            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true:esAutenticado;

            /*if( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                esAutenticado = true;
                break;
            }else{
                System.out.println("Usuario o contraseña incorrectos.");
            }
             */
        }
        String mensaje = esAutenticado ? "Bienvenido usuario " .concat(u).concat("!"):
                "Username o contraseña incorreto!\n Lo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);


        if(esAutenticado){
            System.out.println("Bienvenido usuario: " .concat(u).concat("!"));
        }else {
            System.out.println("Lo siento, requiere autenticación.");
        }

    }
}
