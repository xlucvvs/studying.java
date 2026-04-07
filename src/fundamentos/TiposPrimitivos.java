package fundamentos;

public class TiposPrimitivos {

    static void main() {
        char simbolo = '$';

        boolean estaChovendo = false;
        boolean estouComFome = true;

        byte i1 = 127; // 8 bits
        short i2 = 32767;
        int i3 = 2_147_483_647; // 32 bits
        long i4 = 123;

        float f1 = 123.45f;
        double f2 = 1234.5;

        System.out.println(simbolo);

        System.out.println(estaChovendo);
        System.out.println(estouComFome);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println(f1);
        System.out.println(f2);
    }
}
