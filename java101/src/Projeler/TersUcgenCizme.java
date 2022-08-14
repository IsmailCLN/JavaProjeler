package Döngüler;

import java.util.Scanner;

public class TersUcgenCizme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int n = inp.nextInt();
        /*
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         */
        for (int l = 1; l <= n; l++) {
            for (int m = 1; m <= l; m++) {
                System.out.print(" ");
            }
            for (int o = 1; o <= (2 * n - (2 * l + 1)); o++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

