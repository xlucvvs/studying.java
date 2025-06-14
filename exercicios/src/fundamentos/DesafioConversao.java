package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			String salario1;
			String salario2;
			String salario3;
			
			System.out.println("Insira o Salário 1:");
			salario1 = scanner.nextLine().replace(',', '.');
			System.out.println("Insira o Salário 2:");
			salario2 = scanner.nextLine().replace(',', '.');
			System.out.println("Insira o Salário 3:");
			salario3 = scanner.nextLine().replace(',', '.');
			
			double salarioDouble1 = Double.parseDouble(salario1);
			double salarioDouble2 = Double.parseDouble(salario2);
			double salarioDouble3 = Double.parseDouble(salario3);
	
			double soma = salarioDouble1 + salarioDouble2 + salarioDouble3;
			double media = soma / 3;
			
			System.out.println();
			System.out.printf("Soma: %s \n", soma);
			System.out.printf("Média: %s \n", media);
		
		scanner.close();
	}
}
