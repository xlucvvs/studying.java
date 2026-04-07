package fundamentos;

public class ConversorTemperatura {

    static void main() {
        final double fahrenheit = 100.0;
        final double celsius = (fahrenheit - 32) * 5/9;

        System.out.println(celsius);
    }
}
