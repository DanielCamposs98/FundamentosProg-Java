package Entran;

import java.util.Scanner;

public class Funcion {
 public static void main (String[]args){
	 Scanner E= new Scanner(System.in);
	 //Datos
	 System.out.println("Cual seria el valor de X");
	 int X= E.nextInt();
	 int N= X+1;
	 
	 //Procedimentos
	 double S=0;
	double T;
	 for(int i=0;i<N;i++){
		 T= Math.pow(X, i)/factorial(i);
		 S= S+T;
	 }
	 System.out.println("El resultado es: "+S);
 }
 //Metodo Factorial
 public static double factorial (int n){
	double aux=1;
	for(int i=1;i<=n;i++){
		aux= aux*i;
	}
	return aux;
	}
	
	
 }
