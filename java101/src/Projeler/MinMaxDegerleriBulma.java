package Döngüler;

import java.util.Scanner;

public class MinMaxDegerleriBulma {
    public static void main(String[] args) {
        int totalNum, min = 0, max = 0, num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Sayı Girileceğini Yazının:");
        totalNum = inp.nextInt();
        for (int i = 1; i <= totalNum; i++) {
            System.out.println("Sayı Giriniz: ");
            num = inp.nextInt();
            if (i == 1) {
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("En Büyük Sayı: " + max);
        System.out.println("En Küçük Sayı: " + min);
    }
}
