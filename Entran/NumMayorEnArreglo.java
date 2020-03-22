package Entran;

import java.util.Scanner;
public class NumMayorEnArreglo {

	public static void main(String[] args) {
		Scanner E= new Scanner (System.in);
		int Num[]= new int[10];
		int M;
        for (int i=0;i<10;i++){
        	System.out.println("Teclee el valor "+(i+1));
        	Num[i]=E.nextInt();
        }
        M=Num[0];
        for (int i=1;i<10;i++){
        	if(Num[i]>M){
        		M=Num[i];
        	}
        }
	System.out.println("El mayor número de la cadena es: "+M);
	}

}
