package fundamentos;

public class Wrapper {

	public static void main(String[] args) {

		// Byte b = 100;
		Byte b = 33; // byte
		// Short s = 1000;
		Short s = 333; // short

		// Integer.parseInt(entrada.next());
		// Integer i = 10000;
		Integer i = 3333; // int
		// Long l = 100000L;
		Long l = 33333L; // long

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F; // float
		System.out.println(f);
		
		Double d = 1234.5678; // double
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
		
	}
}