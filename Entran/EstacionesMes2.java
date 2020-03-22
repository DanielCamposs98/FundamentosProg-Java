package Entran;

import java.util.Scanner;
public class EstacionesMes2 {
 public static void main (String[]args){
	 Scanner E= new Scanner (System.in);
	 int mes;
	 System.out.println("-----MESES-----");
	 System.out.println("1-Enero");
	 System.out.println("2-Febrero");
	 System.out.println("3-Marzo");
	 System.out.println("4-Mayo");
	 System.out.println("5-Abril");
	 System.out.println("6-Junio");
	 System.out.println("7-Julio");
	 System.out.println("8-Agosto");
	 System.out.println("9-Septiembre");
	 System.out.println("10-Octubre");
	 System.out.println("11-Noviembre");
	 System.out.println("12-Diciembre");
	 System.out.println("Ingresa el numero del mes");
	 mes=E.nextInt();
	 if ((mes==12)||(mes==1)||(mes==2)){
		 System.out.println("Es invierno");
	 }else if ((mes==3)||(mes==4)||(mes==5)){
		 System.out.println("Es Primavera");
	 }else if ((mes==6)||(mes==7)||(mes==8)){
		 System.out.println("Es Verano");
	 }else if ((mes==9)||(mes==10)||(mes==11)){
		 System.out.println("Otoño");
	 }else{ 
		 System.out.println("Mes inexistente");
	 }
	 
 }
}
