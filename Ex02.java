package exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		 double D = coletordeInformacoes();
		System.out.println("O resultado " + D);

	}

	public static double coletordeInformacoes() {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o valor de A");
		double A= input.nextInt();
		System.out.println("Insira o valor de B");
		double B= input.nextInt();
		System.out.println("Insira o valor de C");
		double C= input.nextInt();
		input.close();

		calculadordasInformacoes(A, B, C);
		double D = calculadordasInformacoes(A, B, C);
		return D;
	
	}

	public static double calculadordasInformacoes(double A, double B, double C) {

		double R = Math.pow((A + B), 2);
		double S = Math.pow((B + C), 2);
		double D = (R + S) / 2;
		return D;
	}

}
