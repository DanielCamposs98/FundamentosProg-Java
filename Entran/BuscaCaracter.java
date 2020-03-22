package Entran;

import java.util.Scanner;
public class BuscaCaracter {

	public static void main(String[] args) {
		Scanner E= new Scanner (System.in);
		String palabra,caracter;
		System.out.println("Teclea una frase");
		palabra= E.nextLine();
		System.out.println("Teclea el carácter a buscar");
		caracter=E.next();
		char[] posicion = palabra.toCharArray();
                
		for(int i=0;i<palabra.length();i++){
			String PL= String.valueOf(posicion[i]);
			if(caracter.equals(PL)){
				System.out.println("El caracter "+PL+" está en la posición "+i);
			}
		}
	}

}
