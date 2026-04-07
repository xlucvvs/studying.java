package desafios;

public class Simples {

    int a = 10;
    static int b = 12;

    static void main() {
        // Imprimir o valor da variável a
        Simples s = new Simples();
        s.a = 100;

        System.out.println(new Simples().a);
        System.out.println(s.a);

        System.out.println(b);
        System.out.println(Simples.b);
    }
}
