package Entran;


import java.util.*;

public class TrajesDescuento {

    public static void main(String[] args) {
        float costo, D;
        Scanner E = new Scanner(System.in);
        System.out.print("Ingrese el costo del traje:   $");
        costo = E.nextFloat();
        if (costo > 2500) {
            D = (costo / 100) * 15;
            costo = costo - D;
            System.out.println("El costo del traje es de: $" + costo);
            System.out.println("El descuento fue de: $" + D);
        } else {
            D = (costo / 100) * 8;
            costo = costo - D;
            System.out.println("El costo del traje es de: $" + costo);
            System.out.println("El descuento fue de: $" + D);
        }

    }

}
