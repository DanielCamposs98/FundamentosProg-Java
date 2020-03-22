package ProyectoMatrices;

import java.util.Scanner;
public class Codigo {

	int M[][] = new int [5][5];
	int M2[][]= new int [5][5];
    int Est;
	Scanner E= new Scanner (System.in);
	
	 void MostrarMenu(){
		System.out.println("--------------------MEN�--------------------");
		System.out.println("1. Determinar si una matriz es sim�trica. ");
		System.out.println("2. Matriz Triangular Inferior. ");
		System.out.println("3. Transponer Matriz.");
		System.out.println("4. Determinar si la matriz es diagonal");
		System.out.println("5. Determinar si la matriz es triangular superior.");
		System.out.println("6. Determinar si la matriz es triangular inferior.");
		System.out.println("7. Determinar si la matriz es escalar.");
		System.out.println("8. Determinar si la matriz es idemponente.");
		System.out.println("9. Matriz Unidad.");
		System.out.println("10. Salir.");
		System.out.println("Teclea la opcion que deseas ejecutar---->");	
	}
	void PedirNum(){
		for(int i=0;i<M.length;i++){
			for(int j=0;j<M[i].length;j++){
				System.out.println("Ingrese el valor para la posici�n ["+i+"]["+j+"].");
				M[i][j]=E.nextInt();
			}
		}
		Mostrar();
	}
	void Transponer(){
		
		for(int i=0;i<M.length;i++){
			for(int j=0;j<M[i].length;j++){
				M2[j][i]= M[i][j];
			}
		}
		System.out.println("La matriz ha sido transpuesta.");
		ObtenerTrans();
	}
	void ObtenerTrans(){
	System.out.println("Matriz Transpuesta:");
		for(int i=0;i<M2.length;i++){
			for(int c=0;c<M2[i].length;c++){
				System.out.print(M2[i][c]+", ");
			}
			System.out.println("");
	}
	}
	
	void Mostrar(){
		for(int i=0;i<M.length;i++){
		for(int c=0;c<M[i].length;c++){
			System.out.print(M[i][c]+", ");
		}
		System.out.println("");
	
}
	}
	
	void VerificarSimetria(){
		PedirNum();
		do{
			Transponer();

				int CNT=0;
				for(int i=0;i<M.length;i++){
					for(int j=0;j<M[i].length;j++){
						if(M2[i][j]== M[i][j]){
							CNT+=1;
					}
				}
				//imprime simetria
			}
				if(CNT==25){
				System.out.println("La matriz es sim�trica");
				Est=0;
				}else{
					System.out.println("La matriz NO es sim�trica");
					
					CambiarValor();
				}	

			}while(Est==1);
	
	}


	void MTI(){
		int S1=0,S2=0,S3=0,S4=0,S5=0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.println("Ingrese el valor para la posici�n ["+i+"]["+j+"].");
				M[i][j]=E.nextInt();
			}
		}
		
		for(int i=0;i<5;i++){
			for(int w=0;w<5;w++){
				S1+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S2+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S3+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S4+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S5+=M[i][w];
			}
		}
		int CNT=0;
		int I1=M[0][0];
		int I2=M[1][0]+M[1][1];
		int I3=M[2][0]+M[2][1]+M[2][2];
		int I4=M[3][0]+M[3][1]+M[3][2]+M[3][3];
		int I5=M[4][0]+M[4][1]+M[4][2]+M[4][3]+M[4][4];
		if(S1==I1){
			
		}
		
	}
	
	void VerificarDiagonal(){
		PedirNum();
		int S1=0,S2=0,S3=0,S4=0,S5=0;
		int e=0,C=1;
		char Continuar='S';
		do{
		for(int i=0;i<5;i++){
			for(int w=0;w<5;w++){
				S1+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S2+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S3+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S4+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S5+=M[i][w];
			}
			
		}
		if(S1!=M[e][e]){
				C=0;
			}else{
				e++;
				if(S2!=M[e][e]){
					C=0;
					}else{
					e++;
					if(S3!=M[e][e]){
						C=0;
						}else{
						e++;
						if(S4!=M[e][e]){
							C=0;
							}else{
							e++;
							if(S5!=M[e][e]){
								C=0;
							}else if(S5==M[e][e]){
								C=1;
			}
							}}}}
			if(C==1){
				System.out.println("La matriz es diagonal");
				Est=0;
				S1=0;S2=0;S3=0;S4=0;S5=0;
			
			}else if(C==0){
				System.out.println("La matriz NO es diagonal");
				CambiarValor();
				S1=0;S2=0;S3=0;S4=0;S5=0;
				C=1;
			}	
		}while(Est==1);
	
		}
	
							
	void VerificarMTI(){
		PedirNum();
		int S1=0,S2=0,S3=0,S4=0,S5=0;
		do{
		for(int i=0;i<5;i++){
			for(int w=0;w<5;w++){
				S1+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S2+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S3+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S4+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S5+=M[i][w];
			}
		}
		int C;
		int CNT=0;
		int I1=M[0][0];
		int I2=M[1][0]+M[1][1];
		int I3=M[2][0]+M[2][1]+M[2][2];
		int I4=M[3][0]+M[3][1]+M[3][2]+M[3][3];
		int I5=M[4][0]+M[4][1]+M[4][2]+M[4][3]+M[4][4];
		if(S1!=I1){
			C=0;
		}else{
			if(S2!=I2){
				C=0;
				}else{
				if(S3!=I3){
					C=0;
					}else{
					if(S4!=I4){
						C=0;
						}else{
						if(S5!=I5){
							C=0;
							}else{
							C=1;
		}
						}}}}
		if(C==1){
			System.out.println("Es una matriz triangular inferior");
			Est=0;
		}else if(C==0){
			System.out.println("NO es una matriz triangular inferior");
			CambiarValor();
			S1=0;S2=0;S3=0;S4=0;S5=0;
			I1=0;I2=0;I3=0;I4=0;I5=0;
			}	
		}while(Est==1);
	}
	
	
	
	void VerificarMTS(){
		PedirNum();
		int S1=0,S2=0,S3=0,S4=0,S5=0;
		do{
		for(int i=0;i<5;i++){
			for(int w=0;w<5;w++){
				S1+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S2+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S3+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S4+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S5+=M[i][w];
			}
		}
		int C;
		int CNT=0;
		int I1=M[0][0]+M[0][1]+M[0][2]+M[0][3]+M[0][4];
		int I2=M[1][1]+M[1][2]+M[1][3]+M[1][4];
		int I3=M[2][2]+M[2][3]+M[2][4];
		int I4=M[3][3]+M[3][4];
		int I5=M[4][4];
		if(S1!=I1){
			C=0;
		}else{
			if(S2!=I2){
				C=0;
				}else{
				if(S3!=I3){
					C=0;
					}else{
					if(S4!=I4){
						C=0;
						}else{
						if(S5!=I5){
							C=0;
							}else{
							C=1;
		}
						}}}}
		if(C==1){
			System.out.println("Es una matriz triangular superior");
			Est=0;
		}else if(C==0){
			System.out.println("NO es una matriz triangular superior");
			S1=0;S2=0;S3=0;S4=0;S5=0;
			I1=0;I2=0;I3=0;I4=0;I5=0;
			CambiarValor();
			
			}	
		}while(Est==1);
	}
	
	
	void VerificarME(){
		PedirNum();
		int V=M[0][0];
		int C=0;
		char Continuar=' ';
		do{
			for(int i=0;i<M.length&&i<M[i].length;i++){
		
			if(M[i][i]==V){
				C+=1;
			}
		}
		if(C==5){
			System.out.println("Es una matriz escalar");
			Est=0;
		}else{
			System.out.println("NO una matriz escalar");
			CambiarValor();
		}	
	
	}while(Est==1);

	}
	
	void VerificarIdempotencia(){
		PedirNum();
		int Mult[][] = new int[5][5];
		do{
			for (int x=0; x <5; x++) {
		
	        for (int y=0; y < 5; y++) {
	          for (int z=0; z<5; z++) {
	          Mult [x][y] = M[x][z]*M[z][y]; 
	          }
	        }
	      }
	    int CNT=0;
	    for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(Mult[i][j]==M[i][j]){
					CNT+=1;
				}
			}
		}
	    if(CNT==25){
	    	System.out.println("La matriz es idempotente");
	    	Est=0;
	    }else{
	    	System.out.println("La matriz NO es idempotente");
	        CambiarValor();
	        
	    }
		}while(Est==1);
	}
	
	void VerificarMU(){
		PedirNum();
		int S1=0,S2=0,S3=0,S4=0,S5=0;
		int e=0,C=1;
		int V=1;
		char Continuar=' ';
		do{
			for(int i=0;i<5;i++){
			for(int w=0;w<5;w++){
				S1+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S2+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S3+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S4+=M[i][w];
			}
			i++;
			for(int w=0;w<5;w++){
				S5+=M[i][w];
			}
		}
		if(S1!=1){
				C=0;
			}else{
				if(S2!=1){
					C=0;
					}else{
					if(S3!=1){
						C=0;
						}else{
						if(S4!=1){
							C=0;
							}else{
							if(S5!=1){
								C=0;
								}else{
								C=1;
			}
							}}}}
			if(C==1){
				System.out.println("Es una matriz unidad");
				Est=0;
			}else if(C==0){
				System.out.println("NO es una matriz unidad");
				CambiarValor();
				}	
			}while(Est==1);	
			}
	void CambiarValor(){
		System.out.println("Deseas cambiar alg�n valor. S=Si / N=No.");
		char Continuar=E.next().toUpperCase().charAt(0);
		if(Continuar=='S'){
			int F,C1;
			System.out.println("[Fila][Columna]");
			System.out.println("Ingresa el n� de la fila");
			F=E.nextInt();
			System.out.println("Ingresa el n� de la columna");
			C1=E.nextInt();
			System.out.println("Ingresa el nuevo valor");
			int NV= E.nextInt();
			M[F][C1]=NV;
			Est=1;
			Mostrar();
}else{
	Est=0;
}
	}
}

	
	
	
	
	
