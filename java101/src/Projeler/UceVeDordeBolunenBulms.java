package Döngüler;

import java.util.Scanner;

public class UceVeDordeBolunenBulms {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i, adet = 0, toplam = 0 ,ort;
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        i = inp.nextInt();

        for (int k = 1; k <= i; k ++) {
            if ((k % 3 == 0) && (k % 4 == 0)) {
                toplam += i;
                adet++;
            }
        }
        System.out.println("Toplam: "+toplam);
        System.out.println("Adet: "+adet);
        ort = (toplam / adet);
        System.out.print("Ortalama: "+ort);
    }
}
