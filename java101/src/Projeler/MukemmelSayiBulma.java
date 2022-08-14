package Döngüler;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0;
        System.out.print("Sayı Giriniz: ");
        int num = inp.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (total == num) {
            System.out.print(num + " mükemmel sayıdır");
        } else {
            System.out.print(num + " mükemmel sayı değildir");
        }
    }
}
