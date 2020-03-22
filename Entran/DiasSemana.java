package Entran;


import java.util.Scanner;

public class DiasSemana {

    public static void main(String[] args) {
        //Realiza un ejercicio que lea un dia de la semana 1...7 y escriba su correspondiente dia en texto
        Scanner E = new Scanner(System.in);
        int D;
        System.out.println("------DIAS-----");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");
        System.out.println();
        System.out.println("Ponle un dia");
        D = E.nextInt();
        switch (D) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("No existe");

        }
    }

}
