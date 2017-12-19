package com.cip.program;

import java.util.Scanner;

public class PracticaUt3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		final double constante1 = 32;
		final double constante2 = 9;
		final double constante3 = 5;
		
				
		System.out.println("Introdusca Grados Centigrados");
		double GradosC = sc.nextDouble();
		 
			double GradosF = GradosC*constante2/constante3+constante1;
			System.out.println("En Grados Fahrenheit" + GradosF);
	
	sc.close();

	}

}
