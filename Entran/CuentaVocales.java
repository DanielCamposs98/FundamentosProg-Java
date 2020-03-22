package Entran;


import java.util.*;

public class CuentaVocales {

    public static void main(String[] args) {
        //Hacer un programa que lea 100 caracteres  y cuente cuantas vocales hay.
        //La salida debe se:
        // Hay ---- a's
        // Hay ---- e's
        // Hay ---- i's
        // Hay ---- o's
        // Hay ---- u's
        int A = 0, E = 0, I = 0, O = 0, U = 0, C = 1;
        char L;
        Scanner R = new Scanner(System.in);

        while (C > 0 && C <= 5) {
            System.out.println("Teclee una letra");
            L = R.next().charAt(0);
            switch (L) {
                case 'a':
                case 'A':
                    A++;
                    break;
                case 'e':
                case 'E':
                    E++;
                    break;
                case 'i':
                case 'I':
                    I++;
                case 'o':
                case 'O':
                    O++;
                    break;
                case 'u':
                case 'U':
                    U++;
                    break;
            }
            C++;

        }
        System.out.println("Hay " + A + "a's");
        System.out.println("Hay " + E + "e's");
        System.out.println("Hay " + I + "i's");
        System.out.println("Hay " + O + "o's");
        System.out.println("Hay " + U + "u's");
    }

}
