package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] numb = new int [n];
		
		for (int i=0;i<numb.length;i++) {
			System.out.print("Digite um numero: ");
			numb[i] = sc.nextInt();
		}
		
		int pares = 0;
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		
		for(int i=0;i<numb.length;i++) {
			if (numb[i]%2 == 0) {
				System.out.print(numb[i] + " ");
				pares ++;
			}	
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + pares);
		
		sc.close();
	}

}
