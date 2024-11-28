package Variables;

public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 2.12e3f;//2120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a: " + Float.BYTES);
        System.out.println("float corresponde en bites a: " + Float.SIZE);
        System.out.println("Máximo valor para float:" + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float:" + Float.MIN_VALUE);

        double realDouble = 3.12321;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a: " + Double.BYTES);
        System.out.println("double corresponde en bites a: " + Double.SIZE);
        System.out.println("Máximo valor para float:" + Double.MAX_VALUE);
        System.out.println("Mínimo valor para float:" + Double.MIN_VALUE);

        var varFlotante = 3.233f;
        System.out.println("varFlotante = " + varFlotante);

    }
}
