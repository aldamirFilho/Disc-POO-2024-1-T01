package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso do saco de ração : ");
		double saco = sc.nextDouble() ;
		
		System.out.println("Digite a quantia de ração para o seu primeiro gato: ");
		double gato1 = sc.nextDouble() ;
		
		System.out.println("Digite a quantia de ração para o seu segundo gato: ");
		double gato2 = sc.nextDouble() ;
		
		double cat1 = gato1/1000;
	    double cat2 = gato2/1000; 
	    
	    double total = saco - 5 * (cat1 + cat2);
	    
	    System.out.println("a quantidade de ração que sobrou foi: " + total);
	}
	
}