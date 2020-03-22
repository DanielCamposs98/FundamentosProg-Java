package Entran;


import java.util.Scanner;

public class Equals {

    public static void main(String args) {
        // TODO Auto-generated method stub
        Scanner L = new Scanner(System.in);
        System.out.println("Introduce un mes:");
        while (true) {
            String m = L.next();
            if (m.equalsIgnoreCase("enero") || m.equalsIgnoreCase("febrero") || m.equalsIgnoreCase("diciembre")) {
                System.out.println("La estación es invierno");
            } else {
                if (m.equalsIgnoreCase("marzo") || m.equalsIgnoreCase("abril") || m.equalsIgnoreCase("mayo")) {
                    System.out.println("La estación es primavera");
                } else {
                    if (m.equalsIgnoreCase("junio") || m.equalsIgnoreCase("julio") || m.equalsIgnoreCase("agosto")) {
                        System.out.println("La estación es verano");
                    } else {
                        if (m.equalsIgnoreCase("septiembre") || m.equalsIgnoreCase("octubre") || m.equalsIgnoreCase("noviembre")) {
                            System.out.println("La estación es oto�o");
                        }
                    }
                }
            }
        }
    }
}
