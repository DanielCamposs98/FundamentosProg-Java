package Entran;

import java.util.Scanner;
public class Ventas {

	public static void main(String[] args) {
	   Scanner E= new Scanner (System.in);
	   int V,P,V1=0,V2=0,V3=0,C1=0,C2=0,C3=0;
	   System.out.println("Cuantas ventas has tenido?");
	   V= E.nextInt();
	   for(int i=1;i<=V;i++){
			 System.out.println("Cual es el precio de la venta?");
			 P=E.nextInt();
			 if(P<=10000){
				 C1=C1+1;
			     V1=V1+P;
			 }else if (P>10000 && (P<20000)){
				 C2=C2+1;
				 V2=V2+P;
		
		 }
		
	}
	   System.out.println("N� de ventas mayores o iguales a 10000: "+C1+", total vendido= $"+V1);
		 System.out.println("N� de ventas mayores de 10000 pero menores o iguales que 20000: "+C2+", total vendido= $"+V2);
		 System.out.println("Ventas globales: $"+(V1+V2));
	}
}
