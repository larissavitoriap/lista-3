package lista3;

import java.util.Scanner;

public class j9 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        {


            int valor = 0;
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            do {
                System.out.println("informe o valor");
                valor = input.nextInt();
                if (valor > maior) {
                    maior = valor;
                }

                if (valor < menor) {
                    menor = valor;
                }
                System.out.println("o maior valor é:  " + maior);

                System.out.println(" o menor valor é:  " + menor);

            } while (valor >= 0);


            input.close();
        }


    }
}

