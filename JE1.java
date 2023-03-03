package lista3;

import java.util.Scanner;

public class JE1 {
    public static void main(String[] args) {
int N;
        Scanner input = new Scanner(System.in);

        System.out.println("informe N");
        N = input.nextInt();

        if (N < 0) {
            N = N * -1;
            System.out.println("resultado:" + N);
        } else {
            System.out.println(" o numero positivo é: " + N);

        }

        //exercicio 5



        input.close();
    }


}
