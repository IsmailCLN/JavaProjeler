package Projeler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5, a, e, d, m, p, toplam;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Verem Abime ");
        a = girdi.nextDouble();
        System.out.print("Kaç Kilo Elma Verem Abime ");
        e = girdi.nextDouble();
        System.out.print("Kaç Kilo Domates Verem Abime ");
        d = girdi.nextDouble();
        System.out.print("Kaç Kilo Muz Verem Abime ");
        m = girdi.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Verem Abime ");
        p = girdi.nextDouble();

        toplam = ((a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlican));

        System.out.print(toplam+" lira tuttu abim benim");
    }
}
