package desafios;

import java.util.Scanner;

public class Calculadora {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        String valor1 = teclado.nextLine().replace(',', '.');
        double n1 = Double.parseDouble(valor1);

        System.out.print("Informe o segundo número: ");
        String valor2 = teclado.nextLine().replace(',', '.');
        double n2 = Double.parseDouble(valor2);

        System.out.print("Informe a operação (+,-,*,/,%): ");
        String operacao = teclado.nextLine();

        teclado.close();
        
        double resultado = "+".equals(operacao) ? n1 + n2 : 0;
        resultado = "-".equals(operacao) ? n1 - n2 : resultado;
        resultado = "*".equals(operacao) ? n1 * n2 : resultado;
        resultado = "/".equals(operacao) ? n1 / n2 : resultado;
        resultado = "%".equals(operacao) ? n1 % n2 : resultado;


        System.out.printf("Resultado é %.2f", resultado);
    }
}
