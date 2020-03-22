package Entran;

import java.util.Scanner;
public class Substrings {
 public static void main (String[]args){
	 String cd;
	 int k;
	 char ch;
	 Scanner E=new Scanner (System.in);
	 System.out.println("Teclea 2 enteros separados por un espacio");
	 cd=E.nextLine();
	 
	 for (k=0;(k<cd.length()&&(cd.charAt(k)!=' '));k++);
	 String v1,v2;
	 v1=cd.substring(0,k);
	 v2=cd.substring(k+1);
	 System.out.println("Primer entero: "+v1);
	 System.out.println("Segundo entero: "+v2);
	 }
		 
	 
 }
