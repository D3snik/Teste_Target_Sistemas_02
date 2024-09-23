package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.fibonacci;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fibonacci fib = new fibonacci(); 
		List<Integer> list = new ArrayList<>();
		
		System.out.print("Digite o número que deseja verificar na sequência de Fibonacci :");
		int n = sc.nextInt();
		
		//Eu defini um numero limitado para  a sequencia
		int limite = 50;//Fique a vontade para trocar o valor
		
		for(int i = 0; i<limite; i++) {
			int fibonacciA = fib.fibonacciRecursivo(i);
			if (fibonacciA > n) {
				break;
			}
			list.add(fibonacciA);
		}
		 if (list.contains(n)) {
	            System.out.println("O número " + n + " está na sequência de Fibonacci.");
	        } else {
	            System.out.println("O número " + n + " não está na sequência de Fibonacci.");
	        }
		sc.close();
	}
}

