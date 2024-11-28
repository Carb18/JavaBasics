package ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 2323;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto2 = " + intObjeto2);

        int num = intObjeto2;
        int num2 = intObjeto2.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "555646";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
