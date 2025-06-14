package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		

		final int fator = 32;
		final double ajuste = ((double) 5/9);
		
		int fahrenheit = 86;
		double celsius = (fahrenheit - fator) * ajuste;
		
		System.out.println("O resultado é " + celsius + "ºC.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - fator) * ajuste;
		
		System.out.println("O resultado é " + celsius + "ºC.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - fator) * ajuste;
		
		System.out.println("O resultado é " + celsius + "ºC.");

	}
}
