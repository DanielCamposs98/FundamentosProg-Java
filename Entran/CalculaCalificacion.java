package Entran;

import java.util.Scanner;

public class CalculaCalificacion {

	public static void main(String[] args) {
		Scanner E= new Scanner (System.in);
		int Cal[]= new int[3];
		int A=0,R=0;
		float Prom=0;
		for(int i=0;i<3;i++){
			System.out.println("Ingresa la calificaci�n "+(i+1));
			Cal[i]=E.nextInt();
			Prom+=Cal[i]/Cal.length;
			if(Cal[i]>=70){
				A++;
			}else{
				R++;
			}	
		}	
		System.out.println("Hay: "+A+" aprobados.");
		System.out.println("Hay: "+R+" reprobados.");
		System.out.println("El promedio es de: "+Prom);
	}
}
