package Entran;

import java.util.Scanner;

public class SalarioIncremento {

	public static void main(String[] args) {
		double S=1500;
	
		Scanner E= new Scanner (System.in);	
		System.out.println("Salario Inicial: $" + S);
	    for(int i=1;i<=6;i++){
	     S=S*1.1;
	    	System.out.println("INCREMENTO POR AñO");
	    	System.out.println(S);
	        
	    }
	
	}

}
