package Entran;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosProbabilidad {

    public static void main(String[] args) {
        //Realizar un programa que almecene 100 datos (entre 1-20) en un arreglo 
        //de forma aleatoria y realice las siguientes operaciones mediante un menu
        //de opciones: 1-Moda, 2-Mediana, 3-Varianza, 4- Desviación estándar, 5-Salir.
        int rango = 20;
        int Datos[] = new int[10];
        int Opcion;
        Scanner E = new Scanner(System.in);
        Random Aleatorio = new Random();
        //Pedir Números
        System.out.println("Hola, te he generado los siguientes 10 números al azar; ");
        for (int i = 0; i < 10; i++) {
            Datos[i] = (int) (Math.random() * 20) + 1;
            System.out.print(Datos[i] + " ");
        }
        System.out.print("\n");
        do {
            System.out.println("Teclea el número correspondiente a la operación que quieras averiguar.");
            System.out.println("1. Moda. 2. Mediana. 3. Varianza. 4. Desviación Estándar. 5- Salir.");
            Opcion = E.nextInt();
            int M = 0;
            int MVR = 0;
            int VR = 0;
            int max = 0;
            int moda = 0;

            switch (Opcion) {
                case 1:
                    int i = 1;
                    int veces = 0;
                    for (int j = 0; j < Datos.length; j++) {
                        if (Datos[j] == Datos[i]) {
                            veces++;

                        }
                        if (veces > max) {
                            moda = Datos[j];
                            max = veces;
                        }

                    }
                    System.out.println(" ");
                    System.out.println("La moda es " + moda + " y se repiti� " + max + " veces.");

                    break;

                case 2:
                    double mediana;
                    int aux;
                    for (int j = 0; j < Datos.length; j++) {
                        for (int q = 0; q < Datos.length; q++) {
                            for (j = q + 1; j < Datos.length; j++) {
                                if (Datos[q] > Datos[j]) {
                                    aux = Datos[q];
                                    Datos[q] = Datos[j];
                                    Datos[j] = aux;
                                }
                            }
                            System.out.print("   ");
                            System.out.print(Datos[q] + " ");
                        }
                    }
                    mediana = (Datos[4] + Datos[5]);
                    mediana /= 2;
                    System.out.println("");
                    System.out.println("La mediana es igual a " + mediana);
                    break;
                case 3:

                    double promedio = 0,
                     varianza = 0;
                    for (int w = 0; w < Datos.length; w++) {

                        promedio += Datos[w];
                    }
                    promedio /= 10;
                    double x = 0;
                    for (int j = 0; j < 10; j++) {
                        x = ((Datos[j]) - (promedio));
                        x = x * x;
                        varianza += x;
                    }
                    varianza = varianza / 10;
                    System.out.println("");
                    System.out.println("La varianza es igual a " + varianza);
                    break;
                case 4:
                    double pro = 0,
                     vari = 0,
                     de = 0;
                    for (int t = 0; t < Datos.length; t++) {
                        pro += Datos[t];
                    }
                    pro /= 10;
                    double b = 0;
                    for (int j = 0; j < 10; j++) {
                        b = ((Datos[j]) - (pro));
                        b = b * b;
                        vari += b;
                    }
                    vari /= 10;
                    de = Math.sqrt(vari);
                    System.out.println("");
                    System.out.println("La desviaci�n est�ndar es igual a " + de);
                    break;
                case 5:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Opcion inexistente");
                    break;
            }

        } while (Opcion != 5);
    }
}
