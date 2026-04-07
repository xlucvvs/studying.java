package fundamentos;

import fundamentos.dados.Usuario;

import java.util.Date;

public class ExemploImport {

    static void main() {
        Date data = new Date();
        System.out.println(data);

        java.lang.String texto = "Exemplo de import!!!";
        java.lang.System.out.println(texto);

        Usuario usuario = null;
        System.out.println(usuario);
    }
}
