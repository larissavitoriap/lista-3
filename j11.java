package lista3;

import com.sun.jdi.event.BreakpointEvent;

import java.util.Scanner;

public class j11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ma[]= new int[15];
        int mb []= new int[15];
        int mc []= new int[30];


        //a

        for (int i = 0; i < 15; i++) {
        System.out.println("informe o valor de ma");

        ma[i]=input.nextInt();

        }
        //b
        for (int i = 0; i < 15; i++) {

            System.out.println("digite o valor de mb:  ");
         mb[i]= input.nextInt();
        }

        //resultado
        for (int i = 0; i < 15; i++) {
            mc[i]= ma[i];
            mc[i + 15]= mb[i];
        }
        System.out.println("valor matriz c: ");
        for (int i = 0; i < 30; i++) {
            System.out.println(mc[i] + " ");
        }

        input.close();
    }
}
