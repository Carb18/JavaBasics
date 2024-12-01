package MathClass;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String [] colores = { "blue", "green", "red", "yellow", "Cyan","Purple","black" };

        double random = Math.random();
        System.out.println("random = " + random);

        random *= 8;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int)random]);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);


    }
}
