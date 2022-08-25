package Metotlar;

import java.util.Scanner;

public class HesapMakinesiV2 {

    static void add() {
        int a, b, result;
        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        a = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        b = inp.nextInt();
        result = a + b;
        System.out.println("Sonuç: " + result);
    }

    static void ext() {
        int a, b, result;
        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        a = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        b = inp.nextInt();
        result = a - b;
        System.out.println("Sonuç: " + result);
    }

    static void mult() {
        int a, b, result;
        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        a = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        b = inp.nextInt();
        result = a * b;
        System.out.println("Sonuç: " + result);
    }

    static void div() {
        int a, b;
        double result;
        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        a = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        b = inp.nextInt();
        result = a / b;
        System.out.println("Sonuç: " + result);
    }

    static void pow() {
        int a, b, result = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban Değeri Giriniz");
        a = inp.nextInt();
        System.out.println("Üs Değeri Giriniz");
        b = inp.nextInt();
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç: " + result);
    }

    static void fact() {
        int a, result = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı Giriniz");
        a = inp.nextInt();

        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod() {
        int a, b, result;
        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        a = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        b = inp.nextInt();
        result = a % b;
        System.out.println("Sonuç: " + result);
    }

    static void rect() {
        int a, b, alan, cevre;
        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        a = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        b = inp.nextInt();
        alan = a * b;
        cevre = 2 * (a + b);
        System.out.println("Alan: " + alan + " Çevre: " + cevre);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        System.out.print("Lütfen bir işlem seçiniz :");
        select = inp.nextInt();
        switch (select) {
            case 1:
                add();
                break;
            case 2:
                ext();
                break;
            case 3:
                mult();
                break;
            case 4:
                div();
                break;
            case 5:
                pow();
                break;
            case 6:
                fact();
                break;
            case 7:
                mod();
            case 8:
                rect();
        }
    }
}