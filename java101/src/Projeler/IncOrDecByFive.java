package Metotlar;

import java.util.Scanner;

public class IncOrDecByFive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, tempA;
        System.out.println("Sayı Giriniz: ");
        a = inp.nextInt();
        tempA = a;
        decrease(a, tempA);
    }
    static int decrease (int a, int tempA) {
        System.out.print(tempA + " ");
        if (tempA > 0) {
            return decrease(a,tempA - 5);
        } else {
            return increase(a, tempA);
        }
    }
    static int increase (int a, int tempA) {
        System.out.print(tempA + " ");
        if (tempA < a) {
            return increase(a, tempA + 5);
        } else {
            return 0;
        }
    }
}
