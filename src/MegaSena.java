import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        int x;
        Random generate = new Random(); //recebe objeto do tipo random

        //int number = generate.nextInt(60);
        //while(true): loop infinito
        //while (i < 10): expressão dentro do while gera um loop com saída
        // for (;;): loop infinito

        //int i = 0;
        //while(i < 6){
            //int number = generate.nextInt(60);
            //System.out.println(number);
            //i++; ou i = i + 1;
        //}

        for(int i = 0; i < 6; i++){
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}
