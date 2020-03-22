package Entran;


import java.util.*;
public class MayorDeDosNumeros {

	public static void main(String[] args) {
		//Implementar un programa para determinar cual de 2 
		//valores proporcionados por el usuario es mayor.
		float V1,V2;
		Scanner E= new Scanner(System.in);
		System.out.println("Ingrese el primer valor");
		V1=E.nextFloat();
		System.out.println("Ingrese el segundo valor");
		V2=E.nextFloat();
		if(V1>V2){
			System.out.println("El Valor mayor es: " + V1);
		}else if (V1==V2){
			System.out.println("Los valores son iguales" );
		}else{
		System.out.println("El valor mayor es: "+ V2 );

	}

	}

}
