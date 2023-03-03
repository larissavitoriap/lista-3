package lista3;

import java.util.Scanner;

public class j12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temperatura[] = new double[4];


        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;


        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("insira a temperatura:");
            temperatura[i] = input.nextDouble();
        }

        //matrizA

        for (int i = 0; i < temperatura.length; i++) {


            System.out.println("graus celsius" + temperatura[i]);
        }


        for (int j = 0; j < temperatura.length; j++) {


            if (temperatura[j] > maior) {
                maior = temperatura[j];
            }

            if (temperatura[j] < menor) {
                menor = temperatura[j];
            }

        }
        System.out.println("o maior valor é:  " + maior);

        System.out.println(" o menor valor é:  " + menor);





        input.close();

    }
}
