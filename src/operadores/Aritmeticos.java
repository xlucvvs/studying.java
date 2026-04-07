

public class Aritmeticos {
    static void main() {
    int a = 7;
    double b = 3;

//    IO.println(a + b);
//    IO.println(a + 12);
//    IO.println(19 + 12 + 7 + 876);

    IO.println("Soma: " + (a + b));
    IO.println("Subtração: " + (a - b));
    IO.println("Multiplicação: " + (a * b));
    IO.println("Divisão: " + (a / b)); // int / int -> int
    IO.println("Módulo: " + (a % b));

    IO.println(6 * 5 + (5 - 3) % 7 / 3 * 12);
}

}