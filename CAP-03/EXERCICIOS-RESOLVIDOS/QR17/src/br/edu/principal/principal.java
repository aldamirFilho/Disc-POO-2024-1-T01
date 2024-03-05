package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		double salario = sc.nextDouble() ;
		
		System.out.println("Digite seu primeiro cheque: ");
		double cheque1 = sc.nextDouble() ;
		
		System.out.println("Digite seu segundo cheque: ");
		double cheque2 = sc.nextDouble() ;
		
		double cpmf1 = cheque1 * 0.38/100;
		double cpmf2 = cheque2 * 0.38/100;
		
		double saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2 ;
		 System.out.println("o Saldo será de: " + saldo);
		 
		 sc.close();
     	}

}

