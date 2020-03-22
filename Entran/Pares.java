package Entran;


import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
        int N = 2, CT = 0;
        System.out.println("Teclee un número");
        N = E.nextInt();
        while (N % 2 == 0) {
            CT++;
            System.out.println("Teclee número");
            N = E.nextInt();
        }
        System.out.println("Total de pares= " + CT);
    }

}
