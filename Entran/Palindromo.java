package Entran;

import java.util.Scanner;
public class Palindromo {

	public static void main(String[] args) {
		//pedir cadena
		Scanner E= new Scanner(System.in);
		System.out.println("Ingresa una oración para averiguar si es un palíndromo");
		String C1= E.nextLine();
		String aux=C1;
		//Quitar espacios a la cadena
		C1=C1.replace(" ", "");
		int h=0;
		//Comparar al derecho y al rev�s
		for(int i=0;i<C1.length();i++){
			for(int j=C1.length()-1;j>=0;j--){
				if(C1.charAt(i)==C1.charAt(j)){
					h=1;
				}else{
					h=0;
				}
			}
		}
		switch (h){
		case 1:
			System.out.println("Es un palíndromo");
			break;
		case 0:
			System.out.println("No es un palíndromo");
			break;
		}
}
}
