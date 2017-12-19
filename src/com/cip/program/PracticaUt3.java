package com.cip.program;

import java.util.Scanner;

public class PracticaUt3 {

	public static void main(String[] args) {

		/* Primer ejercicio de la practica */
		
		  Scanner sc = new Scanner (System.in);
		  
		  final double constante1 = 32; 
		  final double constante2 = 9; 
		  final double constante3 = 5;
		  
		  
		  System.out.println("Introdusca Grados Centigrados"); 
		  double GradosC = sc.nextDouble();
		  
		  double GradosF = GradosC*constante2/constante3+constante1;
		  System.out.println("En Grados Fahrenheit" + GradosF);
		  
		  sc.close();
		 
		
		/* Segundo ejercicio de la practica */
		/*
		Scanner sc = new Scanner(System.in);

		final int constante1 = 32;
		final int constante2 = 9;
		final int constante3 = 5;

		System.out.println("Introdusca Grados Fahrenheit");
		int GradosFa = sc.nextInt();

	    double GradosC = (double)(constante2/constante3)*GradosFa-constante1;
		System.out.println("En Grados Centigrados"  + GradosC);
		
		sc.close();
        */
		
	}

}
