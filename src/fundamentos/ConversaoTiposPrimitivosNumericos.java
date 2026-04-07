package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    static void main() {
        double a = 1; // Conversão Implícita
        System.out.println(a);

        int b = (int) 1.99999999; // Conversão Explícita (CAST)
        System.out.println(b);

        long c = 1233872468;
        byte d = (byte) c; // Conversão Explícita (CAST)
        System.out.println(d);
    }
}
