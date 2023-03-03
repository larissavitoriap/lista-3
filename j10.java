package lista3;

import java.util.Scanner;

public class j10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ma[] = new String[10];
        String mb[] = new String[10]; // guardar resultado


        //a
        for (int i = 0; i < 10; i++) {
            System.out.println("adicione os nomes");
            ma[i] = input.next();

        }

        //b

        for (int i = 0; i < 10; i++) {

            mb[i] = ma[i];
        }

        //resultado

        System.out.println("nomes");
        for (int i = 0; i < 10; i++) {
            System.out.println(mb[i] + " ");

        }






        input.close();
    }
}
