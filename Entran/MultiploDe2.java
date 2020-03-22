package Entran;


import java.util.*;

public class MultiploDe2 {

    public static void main(String[] args) {
        //Realice un programa para determinar si un numero es multiplo de 2 o no
        int N;
        Scanner E = new Scanner(System.in);
        System.out.println("Ingrese un número");
        N = E.nextInt();
        if (N % 2 == 0) {
            System.out.println("El número es multiplo de 2");
        } else {
            System.out.println("No es multiplo de 2");
        }
    }
}
