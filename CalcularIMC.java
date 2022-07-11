package Fundamentos;

import java.util.Scanner;

public class CalcularIMC {
	
	public static void main(String[] args) {
		
		double peso;
		double altura;
		double imc;
		
		Scanner teclado = new Scanner(System.in); // aqui instanciei a classe
		
		System.out.print("Entre com seu peso: ");
		peso = teclado.nextDouble();
		
		System.out.print("Entre com sua altura: ");
		altura = teclado.nextDouble();
		
		imc = peso / (altura * altura);
		System.out.println();
		System.out.println("Seu IMC eh: " + imc + "%");
		System.out.println();
		
		if (imc < 17) {
			System.out.println("MUITO ABAIXO DO PESO");
		}
		else if (imc > 17 & imc <= 18.49){
			System.out.println("ABAIXO DO PESO");
		}	
		else if (imc > 18.5 & imc <= 24.99){
			System.out.println("PESO NORMAL");
		}
		else if (imc > 25 & imc <= 29.99){
			System.out.println("ACIMA DO PESO");
		}
		else if (imc > 30 & imc <= 34.99){
			System.out.println("OBESIDADE I");
		}
		else if (imc > 35 & imc <= 39.99){
			System.out.println("OBESIDADE II");
		}
		else {
			System.out.println("OBESIDADE III" + "(Morbida)");
		}		
	}
}
