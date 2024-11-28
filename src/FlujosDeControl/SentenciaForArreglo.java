package FlujosDeControl;

import javax.swing.*;
import java.util.Arrays;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String [] nombres = {"Camilo", "Andres","Pato","Hola"};
        int count = nombres.length;
        for (int i = 0; i <= count-1; i++ ){
            /*if (nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("hola")){
                continue;
            }*/
            System.out.println( i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Camilo");
        System.out.println("Buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + " Fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " No existe en el sistema.");
        }
    }
}
