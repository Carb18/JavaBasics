package CommandPrompt;

public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {
        if(args.length != 3){
            System.err.println("Por favor ingresar una operacion (suma, resta, div o multi) y dos enteros");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;
        try{
             a = Integer.parseInt(args[1]);
             b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            System.err.println("Por favor ingresar un numero entero, intente de nuevo");
        }



        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
                case "resta":
                    resultado = a - b;
                    break;
                    case "multiplica":
                        resultado = a * b;
                        break;
                        case "divide":
                            if(b == 0){
                                System.err.println("No se puede dividir entre 0 y 0");
                                System.exit(-1);
                            }
                            resultado = a / b;
                            break;
            default:
                resultado = a+b;

        }
        System.out.println("Resultado de la operacion : " + operacion + " es: " + resultado);

    }
}
