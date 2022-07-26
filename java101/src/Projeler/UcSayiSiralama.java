package Projeler;

import java.util.Scanner;

public class UcSayiSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        b = input.nextInt();
        System.out.println("Üçüncü Sayıyı Giriniz: ");
        c = input.nextInt();

        if (a>b && a>c && b>c) {
            System.out.println("a>b>c");
        }
        if (a>b && a>c && c>b) {
            System.out.println("a>c>b");
        }
        if (b>c && b>a && c>a) {
            System.out.println("b>c>a");
        }
        if (b>a && b>c && a>c) {
            System.out.println("b>a>c");
        }
        if (c>a && c>b && a>b) {
            System.out.println("c>a>b");
        }
        if (c>b && c>a && b>a) {
            System.out.println("c>b>a");
        }
    }
}
