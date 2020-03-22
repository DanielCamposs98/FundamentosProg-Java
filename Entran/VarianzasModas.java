package Entran;

import java.util.Random;
import java.util.Scanner;
public class VarianzasModas {
	static int rango=20;
	static int Datos[]= new int[10];
	public static void PideNumeros(){
		Random Aleatorio= new Random();
		//Pedir N�meros
		System.out.println("Hola, te he generado los siguientes 100 n�meros al azar; ");
		for(int i=0;i<10;i++){
			Datos[i]=(int) (Math.random()*20)+1;
			System.out.print(Datos[i]+" ");
	}
	}
		public static void Moda(){
			int i=1;
			int veces = 0;
			int moda = 0;
			int max = 0;
			for(int j=0; j<Datos.length; j++){
				if(Datos[i] == Datos[j])
				veces++;
			}
				if(veces > max){
				moda = Datos[i];
				max = veces;
				}
			
				System.out.println("");
				System.out.println("La moda es "+moda+" y se repiti� "+max+" veces.");
		}
		public static void Mediana(){
			double mediana; 
			int aux;
			for(int j=0; j<Datos.length; j++)
			{
				for(int q=0; q<Datos.length; q++)
				{
					for(j=q+1; j<Datos.length; j++)
					{
						if (Datos[q]>Datos[j])
								{
							aux=Datos[q];
							Datos[q]=Datos[j];
							Datos[j]=aux;
								}
					}
					System.out.print("   ");
					System.out.print(Datos[q]+" ");
				}
			}
			mediana=(Datos[4]+Datos[5]);
			mediana/=2;
			System.out.println("");
			System.out.println("La mediana es igual a "+mediana);
		}
		public static void Var(){
			double promedio=0, varianza=0;
			for(int w=0; w<Datos.length; w++){
			
			promedio+=Datos[w];
			}
			promedio/=10;
			double x=0;
			for(int j=0;j<10;j++)
			{
			x=((Datos[j])-(promedio));
			x=x*x;
			varianza+=x;
			}
			varianza=varianza/10;
			System.out.println("");
			System.out.println("La varianza es igual a "+varianza);
		}
		public static void DesvEst(){
			double pro=0, vari=0, de=0;
			for(int t=0; t<Datos.length; t++){		
			pro+=Datos[t];
			}
			pro/=10;
			double b=0;
			for(int j=0;j<10;j++)
			{
			b=((Datos[j])-(pro));
			b=b*b;
			vari+=b;
			}
			vari/=10;
			de=Math.sqrt(vari);
			System.out.println("");
			System.out.println("La desviaci�n est�ndar es igual a "+de);
		}

}
	
