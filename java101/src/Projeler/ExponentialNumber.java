package Metotlar;

import java.util.Scanner;

public class ExponentialNumber {

    static int exp(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (a != 0 && b == 0) {
            return 1;
        }
        return exp(a, b - 1) * a;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b;
        System.out.println("Taban değerini giriniz: ");
        a = inp.nextInt();
        System.out.println("Üs değerini giriniz: ");
        b = inp.nextInt();
        int result = exp(a, b);
        System.out.println("Sonuç: " + result);
    }
}
