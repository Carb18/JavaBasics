package CommandPrompt;

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Debe ingresar el argumento o parámetro");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento " + i + ": " + args[i]);
        }

    }
}
