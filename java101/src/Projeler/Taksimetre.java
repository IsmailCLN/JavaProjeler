package Projeler;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int acilis = 10;
        double mesafe, tutar, km = 2.20;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Gidilen Mesafeyi Kilometre Olarak Giriniz: ");
        mesafe = girdi.nextDouble();
        tutar = (mesafe * km) + acilis;

        tutar = (tutar < 20) ? 20 : tutar;

        System.out.print("Yolculuk Tutarı: " + tutar);




    }
}
