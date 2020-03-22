package Entran;


import java.util.Scanner;

public class EstacionMes {

    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
        String Mes;
        char C = 'V';
        while (C == 'V') {
            System.out.println("Ingresa el mes para ver en qué estación está");
            Mes = E.next();
            if (Mes.equalsIgnoreCase("Diciembre") || Mes.equalsIgnoreCase("Enero") || Mes.equalsIgnoreCase("Febrero")) {
                System.out.println("Es Invierno");
                C = 'F';
            } else if (Mes.equalsIgnoreCase("Marzo") || Mes.equalsIgnoreCase("Abril") || Mes.equalsIgnoreCase("Mayo")) {
                System.out.println("Es Primavera");
                C = 'F';
            } else if (Mes.equalsIgnoreCase("Junio") || Mes.equalsIgnoreCase("Julio") || Mes.equalsIgnoreCase("Jgosto")) {
                System.out.println("Es Verano");
                C = 'F';
            } else if (Mes.equalsIgnoreCase("Septiembre") || Mes.equalsIgnoreCase("Octubre") || Mes.equalsIgnoreCase("Noviembre")) {
                System.out.println("Es Otoño");
                C = 'F';
            } else {
                System.out.println("Mes no existente\n");
                

            }
        }
    }
}
