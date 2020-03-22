package Entran;


import java.util.*;
public class Hipotenusa {

	public static void main(String[] args) {
	// Se requiere un programa para determinar la hipotenusa de un triangulo. Recuerde que por teorema de pitagoras se tiene quen C�=A�+B�.
        double A,B,C;
        Scanner E= new Scanner(System.in);
        System.out.println("Ingrese el valor de A");
        A=E.nextDouble();
        System.out.println("Ingrese el valor de B");
        B=E.nextDouble();
        C= Math.sqrt((A*A)+(B*B));
        System.out.println("El valor de la hipotenusa es de: "+C);
	}

	

}
