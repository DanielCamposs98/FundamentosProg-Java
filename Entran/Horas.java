package Entran;


import java.util.*;
public class Horas {

	public static void main(String[] args) {
		// Un estacionamiento requiere determinar el cobro que debe 
		// aplicar a las personas que lo utilizan, considere que el cobro
		// es con base en las horas que lo disponen y que las fracciones 
		// de hora se toman como completas. Realice un programa para resolver esto.
	 float H,PH,P;
	 Scanner E= new Scanner(System.in);
	 System.out.println("Ingrese la cantidad de horas (Redondea las fracciones de tiempo)"+"\n");
	 H=E.nextFloat();
	 System.out.println("Ingrese el precio por hora" + "\n");
	 PH= E.nextFloat();
	 P=H*PH;
	 System.out.println("El cobro es de: $" + P);
	 
	 
	}

}
