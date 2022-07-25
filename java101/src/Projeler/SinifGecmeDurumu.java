package Projeler;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, phy, tr, che, mus;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        tr = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        phy = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        che = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        mus = input.nextInt();

        double ort = (mat + phy + che + mus + tr) / 5;

        if (ort <= 55) {
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Sınıfı Geçtiniz");
        }
        System.out.println("Ortalamanız: "+ort);
    }
}
