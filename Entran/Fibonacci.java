package Entran;


import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
        int N = 0;
        int N2 = 1;
        int VV;
        int lim;
        int C = 3;
        System.out.println("Cuántos números deseas ver de la sucesión de Fibonacci?");
        lim = E.nextInt();
        System.out.println(N);
        System.out.println(N2);

        while (C <= lim) {
            VV = N;
            N = N2;
            N2 = VV + N;

            System.out.println(N2);
            C++;
        }
    }

}
