package lista3;

public class j15 {
    public static void main(String[] args) {
        double v1 =1;
        double v2;
        double v3=0;

        for (int i = 0; i < 64; i++) {

            v2= v1;
            v1= v2*2;
            v3=v3 + v2;
        }
        System.out.println("o valor" + v3);
    }
}
