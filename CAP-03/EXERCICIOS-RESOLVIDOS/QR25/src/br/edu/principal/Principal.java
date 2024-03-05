package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do espetaculo : ");
		double espetaculo = sc.nextDouble() ;
		
		System.out.println("Digite o valor do convite: ");
		double convite = sc.nextDouble() ;
		
		double quantidade  = espetaculo/convite;
		System.out.println("o valor foi: " + quantidade);
	}
}
