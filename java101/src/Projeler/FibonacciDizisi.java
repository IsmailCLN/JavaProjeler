package Döngüler;

import java.util.Scanner;

public class FibonacciDizisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = inp.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.print("0 ");
        for (int i = 1; i <= n; i++){
            n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
    }
}
