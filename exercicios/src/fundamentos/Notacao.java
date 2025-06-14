package fundamentos;

public class Notacao {
	public static void main(String[] args) {
		
		// String não é um tipo primitivo, por isso tem o operador .
		
		String s = "Bom dia X";
		s = s.replace("X", "Lucas");
		s = s.toUpperCase();
		s = s.concat("!");
		
		System.out.println(s);
		System.out.println(
				"Bom dia X"
				.replace("X", "Lucas")
				.toUpperCase()
				.concat("!")
				);
	}
}
