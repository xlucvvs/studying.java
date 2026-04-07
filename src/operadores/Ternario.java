

import java.util.Scanner;

public class Ternario {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual é a média do aluno? ");
        String valorNota = teclado.nextLine().replace(',', '.');
        double nota = Double.parseDouble(valorNota);

        System.out.print("Teve bom comportamento? (s/n): ");
        String valorComportamento = teclado.nextLine();
        boolean bomComportamento = valorComportamento.equalsIgnoreCase("s");

        teclado.close();
        // Uso do operador ternário
        // (expresão boolean) ? true : false
        // Atribuição condicional
        String resultadoEscolar = nota >= 7 ? "Aprovado" : "Em Recuperação";
        double valorDesconto = nota >= 9 && bomComportamento ? 0.35 : 0.15;

        System.out.printf("Resultado: %s %nDesconto: %.0f%%",
                resultadoEscolar, valorDesconto * 100);
    }
}
