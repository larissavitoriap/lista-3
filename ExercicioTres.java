package lista3;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adicione o valor");
        int R = input.nextInt();

        int NA= R-1;
        int N= R+1;

        System.out.println("NA");
        int ExercicioTres = NA;


        int valor = N;



        System.out.println(ExercicioTres);
        System.out.println("N");
        System.out.println(valor);

        input.close();
    }
}
