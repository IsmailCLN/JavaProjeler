package Döngüler;

import java.util.Scanner;

public class BasamakSayilariniToplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, numCounter = 0, total = 0, nValue;
        System.out.println("lütfen bir sayı giriniz: ");
        n = inp.nextInt();
        int tempN = n;

        while (tempN != 0) {
            tempN /= 10;
            numCounter++;
        }

        tempN = n;
        while (tempN != 0) {
            nValue = tempN % 10;
            tempN /= 10;
            total += nValue;

        }
        System.out.println(total);
    }
}
