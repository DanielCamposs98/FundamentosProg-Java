package Entran;


import java.util.Scanner;

public class VentasGlobales {

    public static void main(String[] arga) {
        Scanner E = new Scanner(System.in);
        int N, VP, C1 = 0, V1 = 0, C2 = 0, C3 = 0, V2 = 0, V3 = 0;
        System.out.println("Cuantas ventas has tenido?");
        N = E.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Cual es el precio de la venta?");
            VP = E.nextInt();
            if (VP > 1000) {
                C1 = C1 + 1;
                V1 = V1 + VP;
            } else if (VP > 500 && (VP <= 1000)) {
                C2 = C2 + 1;
                V2 = V2 + VP;
            } else {
                C3 = C3 + 1;
                V3 = V3 + VP;
            }
        }
        System.out.println("N� de ventas mayores de 1000: " + C1 + ", total vendido= $" + V1);
        System.out.println("N� de ventas mayores de 500 pero menores o iguales que 1000: " + C2 + ", total vendido= $" + V2);
        System.out.println("N� de ventas menores o iguales de 500: " + C3 + ", total vendido= $" + V3);
        System.out.println("Ventas globales: $" + (V1 + V2 + V3));
    }
}
