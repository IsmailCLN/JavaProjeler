package Döngüler;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n, exp, result = 1;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Esas Sayıyı Giriniz: ");
        n = inp.nextInt();

        System.out.println("Lütfen Sayı Üssünü Giriniz: ");
        exp = inp.nextInt();

        for (int i = 1; i <= exp; i++) {
            result *= n;
        }
        System.out.println("Sonuç: "+ result);
    }
}
