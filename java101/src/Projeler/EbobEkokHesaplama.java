package Döngüler;

import java.util.Scanner;

public class EbobEkokHesaplama {
    public static void main(String[] args) {
        int n1, n2;
        boolean a = false;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        n2 = inp.nextInt();
        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Pozitif Sayilar Giriniz.");
        } else {
            a = true;
        }
        while (!a) ;
        if (n2 < n1) {
            int tempN2 = n2;
            n2 = n1;
            n1 = tempN2;
        }

        int i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("ebob : " + i);
                break;
            } else {
                i--;
            }
        }

        int j = n2;
        while (j <= (n1 * n2)) {
            if ((j % n1 == 0) && (j % n2 == 0)) {
                System.out.println("ekok : " + j);
                break;
            } else {
                j++;
            }
        }
    }
}

