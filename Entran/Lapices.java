package Entran;


import java.util.*;

public class Lapices {

    public static void main(String[] args) {
        // Realice un programa para determinar cuánto se debe pagar por "x" 
        //cantidad de lápices considerando que si son mas de 999 el costo es 
        //de $8.50, de lo contrario es de $9
        double N;
        Scanner E = new Scanner(System.in);
        System.out.println("Ingrese el número de lápices comprados");
        N = E.nextDouble();
        if (N > 999) {
            System.out.println("El costo de los lapices fue de: $" + (N * 8.50));
        } else {
            System.out.println("El costo de los lapices fue de: $" + (N * 9));
        }
    }
}
