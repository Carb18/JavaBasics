package MathClass;

public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absolute = Math.abs(10);
        System.out.println("absolute = " + absolute);
        
        absolute = Math.abs(-3);
        System.out.println("absolute = " + absolute);

        double max = Math.max(3.5, 8.0);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 8.0);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("tecno = " + techo);

        double piso = Math.floor(8.0);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.6);
        System.out.println("entero = " + entero);


        double exp = Math.exp(3.6);
        System.out.println("exp = " + exp);

        double log = Math.log(3.6);
        System.out.println("log = " + log);

        double potencia = Math.pow(3.6, 2);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(20);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(38.1);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(38.1);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90)" + Math.sin(radianes));
        System.out.println("cos(90)" + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("radianes = " + radianes + Math.cos(radianes));

        radianes = Math.toRadians(90);
        System.out.println("radianes = " + radianes + Math.sin(radianes));

    }
}
