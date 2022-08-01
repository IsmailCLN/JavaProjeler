package Döngüler;

import java.util.Scanner;

public class HarmonikSeriBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        double result = 0.0;
        System.out.println("Harmonik sayısını hesaplamak istediğiniz sayıyı giriniz: ");
        n = inp.nextInt();
        for (double i = 1; i <= n; i++) {
            result += 1/i;
        }
        System.out.println(n+". sıradaki harmonik sayı: "+ result);
    }
}
