package lista3;

import java.util.Scanner;

public class ExercicioQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("adicione os valores");
        Double A = input.nextDouble();
        Double B = input.nextDouble();

        Double ExercicioQ = A - B;


        System.out.println(ExercicioQ);




        input.close();
    }
}
