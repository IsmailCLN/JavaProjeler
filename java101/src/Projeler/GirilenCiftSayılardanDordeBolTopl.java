package Döngüler;

import java.util.Scanner;

public class GirilenCiftSayılardanDordeBolTopl {
    public static void main(String[] args) {
        int i, total = 0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Lütfen Bir Sayı Giriniz: ");
            i = inp.nextInt();
            if (i % 4 == 0) {
                total += i;
            }
        } while (i % 2 == 0);
        System.out.println("Toplam: "+total);
    }
}
