package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso do saco de ra��o : ");
		double saco = sc.nextDouble() ;
		
		System.out.println("Digite a quantia de ra��o para o seu primeiro gato: ");
		double gato1 = sc.nextDouble() ;
		
		System.out.println("Digite a quantia de ra��o para o seu segundo gato: ");
		double gato2 = sc.nextDouble() ;
		
		double cat1 = gato1/1000;
	    double cat2 = gato2/1000; 
	    
	    double total = saco - 5 * (cat1 + cat2);
	    
	    System.out.println("a quantidade de ra��o que sobrou foi: " + total);
	}
	
}