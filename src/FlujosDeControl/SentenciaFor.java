package FlujosDeControl;

import java.io.FileOutputStream;

public class SentenciaFor {
    public static void main(String[] args) {

        for(int i = 0 ; i < 5 ; i++ ){
            System.out.println(i);
        }

        int i = 0;

        for(; ;){
            if(i >= 5){
                break;
            }
            System.out.println(i);
            i++;
        }

        for(int b = 10; b >= 0; b--){
            System.out.println(b);
        }

        for(int b = 0; b <= 10; b++){
            if(b % 2 == 0){
                continue;
            }
            System.out.println(b);
        }
    }
}
