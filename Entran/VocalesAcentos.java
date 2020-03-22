package Entran;


import java.util.*;
public class VocalesAcentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner E= new Scanner(System.in);
		char letra;
		int a=0, e=0, i=0, o=0, u=0;
		int c=0;
		while (c<=10)
			{
		System.out.println("Ingresa una letra: ");
		letra=E.next().charAt(0);	
		if (letra=='a'||letra=='A'||letra=='á'||letra=='Á')
		{
			a++;
		}
		if (letra=='e'||letra=='E'||letra=='é'||letra=='É')
		{
			e++;
		}
		if (letra=='i'||letra=='I'||letra=='í'||letra=='Í')
		{
			i++;
		}
		if (letra=='o'||letra=='O'||letra=='ó'||letra=='Ó')
		{
			o++;
		}
		if (letra=='u'||letra=='U'||letra=='ú'||letra=='Ú')
		{
			u++;
		}
		c++;
			}
		System.out.println("Hay "+a+ " a's");
		System.out.println("Hay "+e+ " e's");
		System.out.println("Hay "+i+ " i's");
		System.out.println("Hay "+o+ " o's");
		System.out.println("Hay "+u+ " u's");
		
		
				
	}

	}

