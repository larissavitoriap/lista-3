package lista3;

import java.util.Scanner;

public class j7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros[]= new int[20];

        int contaImpar= 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("informe os numeros" + i+ " ");
            numeros[i]= input.nextInt();
            if (numeros[i] % 2 == 0)
                contaImpar++;


            }
        System.out.println("o resultado é " + contaImpar+ " ");
                ;

        input.close();
    }
}
