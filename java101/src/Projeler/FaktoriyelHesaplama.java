package Döngüler;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 1;
        System.out.print("Lütfen Faktöriyelini Hesaplamak İstediğiniz Sayıyı Giriniz: ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        System.out.print(n + " Sayısının Faktöriyeli " + total +"'e Eşittir.");
    }
}
