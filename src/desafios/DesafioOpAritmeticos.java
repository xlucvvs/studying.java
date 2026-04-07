package desafios;

@SuppressWarnings("all")
public class DesafioOpAritmeticos {

    static void main() {
        double superiorA = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        double superiorB = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;
        IO.println("O resultado final é " + resultado);
    }
}
