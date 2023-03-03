package lista3;

import java.util.Scanner;

public class ExerciciosDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Adicione o SM");
        double Sm = input.nextDouble();
        System.out.println("Adicione o Pr");
        double Pr = input.nextDouble();
        System.out.println("O resultado é:");

        double ExerciciosDois = Sm + (Sm * Pr / 100);

        System.out.println(ExerciciosDois);


        input.close();
    }
}
