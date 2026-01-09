package Aplication;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();
		int[] lista1 = new int[n];
		int[] lista2 = new int[n];
		int[] somaTotal = new int[n];

		System.out.println("Digite os numeros do vetor A");
		for (int i = 0; i < n; i++) {
			lista1[i] = sc.nextInt();
		}
		System.out.println("Digite os numeros do vetor B");
		for (int i = 0; i < n; i++) {
			lista2[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			somaTotal[i] = lista1[i] + lista2[i];
		}
		System.out.println("VETOR RESULTANTE:");
		for (int num : somaTotal)
			System.out.println(num);
		sc.close();
	}

}
