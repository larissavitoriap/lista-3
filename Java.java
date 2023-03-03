package lista3;

import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe os graus Celsius");
        double C = input.nextDouble();

        double F;
        System.out.println("O valor Fahrenheit:");
        double Java = F = (9 * C + 160) / 5;
        System.out.println(Java);
        input.close();
    }

}
