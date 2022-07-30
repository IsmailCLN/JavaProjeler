package Döngüler;

import java.util.Scanner;

public class DortveBesKuvvetBulma {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        n = inp.nextInt();

        System.out.println(n+" sayısına kadar olan 4'ün katları");
        for (int i = 1; i <= n; i *= 4){
            System.out.println(i);
        }

        System.out.println(n+" sayısına kadar olan 5'ün katları");
        for (int i = 1; i <= n; i *= 5){
            System.out.println(i);
        }

    }
}
