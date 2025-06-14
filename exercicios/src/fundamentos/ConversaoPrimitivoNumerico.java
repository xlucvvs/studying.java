package fundamentos;

public class ConversaoPrimitivoNumerico {

	public static void main(String[] args) {
		
		/*
		 * Conversão Implícita
		 * Funciona por que 1 é menor que double
		 */
		double a = 1; 
		System.out.println(a);
		
		/*
		 * Conversão Explícita via CAST
		 */
		float b = (float) 1.123456788888; 
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
		
		c = 129;
		d = (byte) c;
		System.out.println(d);
		
		c = 127;
		d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; 
		System.out.println(f);
	}
}