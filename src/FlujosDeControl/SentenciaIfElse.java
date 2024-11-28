package FlujosDeControl;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 1.9f;
        if (promedio >= 5.0) {
            System.out.println("Muy buena nota.");
        }else if(promedio >=4.5){
            System.out.println("Buen promedio.");
        }else if(promedio >=3.5){
            System.out.println("Nota aceptable");
        }else if(promedio >=2.0){
            System.out.println("Mala nota.");
        }else{
            System.out.println("Rendimiento muy malo.");
        }
        System.out.println("Tu promedio es: " + promedio);
    }
}
