

@SuppressWarnings("all")
public class TabelaVerdade {

    static void main() {
        System.out.println("Tabela verdade AND...");
        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False

        System.out.println("\nTabela verdade OR...");
        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true); // True
        System.out.println(false || false); // False

        System.out.println("\nTabela verdade XOR v1...");
        System.out.println(true ^ true); // False
        System.out.println(true ^ false); // True
        System.out.println(false ^ true); // True
        System.out.println(false ^ false); // False

        System.out.println("\nTabela verdade XOR v2...");
        System.out.println(true != true); // False
        System.out.println(true != false); // True
        System.out.println(false != true); // True
        System.out.println(false != false); // False

        System.out.println("\nTabela verdade NOT...");
        System.out.println(!true); // False
        System.out.println(!false); // True
    }
}
