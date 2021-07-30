package LatUKL;

public class Lat3 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 80;
        int d;

        for (int i = 0; i < 3; i++) {
            d = a;
            a += b;
            for (int k = 0; k < 5; k++) {
                System.out.print(" " + d);
            }
            System.out.println("");
        }
    }
}
