import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Codigo obj1= new Codigo();
		Scanner E= new Scanner(System.in);
		int Opcion = 0;
		do{
			obj1.MostrarMenu();
			Opcion= E.nextInt();
		switch(Opcion){
		case 1:
			obj1.VerificarSimetria();
			break;
		case 2:
			break;
		case 3:
			obj1.Transponer();
			obj1.ObtenerTrans();
			break;
		case 4:
			obj1.VerificarDiagonal();
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			obj1.VerificarME();
			break;
		case 8:
			break;
		case 9:
			obj1.VerificarMU();
			break;
		case 10:
			
			break;
		case 11:
			System.out.println("Eso es todo. Adios.");
			break;	
		}
		}while(Opcion!=11);
		
	}

	}

	}
	}

}
