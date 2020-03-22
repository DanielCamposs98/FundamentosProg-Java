package Entran;

import java.util.Scanner;
public class SenoYFactorial {

	public static void main(String[] args) {
	Scanner E= new Scanner(System.in);
	//Datos
	System.out.println("Teclea el valor de X");
	int X= E.nextInt();
	int N=X;
    // Procedimiento
	double S=0;
	double T,T2;
			
	for(int i=0;i<N;i++){
		T=Math.pow(X,(i));
		i=i+2;
		T2=Math.pow(X,i);
				i=i+2;
		S=T-(T2/factorial(i));
	}
	System.out.println("El resultado es de: "+S);
	}
	 public static double factorial (int n){
			double aux=3;
			for(int i=1;i<=n;i=i+2){
				aux= aux*i;
			}
			return aux;
			}	
}

