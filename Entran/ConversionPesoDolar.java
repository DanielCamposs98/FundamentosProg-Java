package Entran;


import java.util.*;
public class ConversionPesoDolar {

	public static void main(String[] args) {
		// Una empresa importadora desea determinar cuantos dolares puede adquirir con X cantidad de dinero.
		// Realice un programa para hacer este cálculo.
        float X,VD, Dolares;
        Scanner D = new Scanner (System.in);
        System.out.println("Ingrese el total de dinero en pesos"+"\n");
        X= D.nextFloat();
        System.out.println("Ingrese el valor del dolar en pesos"+"\n");
        VD= D.nextFloat();
       
        Dolares= X/VD;
        System.out.println("$"+X+" Pesos en dolares son: $ "+Dolares);
        
	}

}
