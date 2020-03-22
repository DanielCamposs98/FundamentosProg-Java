package Entran;


import java.util.Scanner;
public class VocalesEnCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		int contador=0;
		String Cad;
		Scanner X= new Scanner (System.in);
		System.out.println("Introduce Cadena");
		Cad= X.next();
		for (int i=0; i<Cad.length(); i++){
			c=Cad.charAt(i);
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
				contador++;
			}
		}
	System.out.println("Total de vocales de la cadena es: "+contador);
	}
}	
		
