package Projeler;
//Elifime armağan

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int d, m;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz Günü Sayı Olarak Giriniz");
        d = input.nextInt();
        System.out.println("Doğduğunuz Ayı Sayı Olarak Giriniz");
        m = input.nextInt();

        switch (m) {
            case 1:
                if (d >= 22) {
                    System.out.print("Kova Burcu");
                } else {
                    System.out.print("Oğlak Burcu");
                }
                break;
            case 2:
                if (d >= 20) {
                    System.out.print("Balık Burcu");
                } else {
                    System.out.print("Kova Burcu");
                }
                break;
            case 3:
                if (d >= 21) {
                    System.out.print("Koç Burcu");
                } else {
                    System.out.print("Balık Burcu");
                }
                break;
            case 4:
                if (d >= 21) {
                    System.out.print("Boğa Burcu");
                } else {
                    System.out.print("Koç Burcu");
                }
                break;
            case 5:
                if (d >= 22) {
                    System.out.print("İkizler Burcu");
                } else {
                    System.out.print("Boğa Burcu");
                }
                break;
            case 6:
                if (d >= 23) {
                    System.out.print("Yengeç Burcu");
                } else {
                    System.out.print("İkizler Burcu");
                }
                break;
            case 7:
                if (d >= 23) {
                    System.out.print("Aslan Burcu");
                } else {
                    System.out.print("Yengeç Burcu");
                }
            case 8:
                if (d >= 23) {
                    System.out.print("Başak Burcu");
                } else {
                    System.out.print("Aslan Burcu");
                }
                break;
            case 9:
                if (d >= 23) {
                    System.out.print("Terazi Burcu");
                } else {
                    System.out.print("Başak Burcu");
                }
                break;
            case 10:
                if (d >= 23) {
                    System.out.print("Akrep Burcu");
                } else {
                    System.out.print("Terazi Burcu");
                }
                break;
            case 11:
                if (d >= 22) {
                    System.out.print("Yay Burcu");
                } else {
                    System.out.print("Akrep Burcu");
                }
                break;
            case 12:
                if (d >= 22) {
                    System.out.print("Oğlak Burcu");
                } else {
                    System.out.print("Yay Burcu");
                }
                break;
        }
    }
}
