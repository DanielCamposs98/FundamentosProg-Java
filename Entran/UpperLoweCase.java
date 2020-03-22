package Entran;

import java.util.Scanner;
public class UpperLoweCase{
 public static void main (String []args){
	 String M,M2;
	 Scanner E= new Scanner (System.in);
	 System.out.println("Inserte su nombre");
	 M=E.next().toUpperCase();
	 System.out.println("En May�sculas: "+M);
	 M2=M.toLowerCase();
	 System.out.println("En Minusculas: "+M2);
			 
 }
}
