package encapsulamento.basico;

public class TesteUsuario {
    static void main() {
        Usuario usuario = new Usuario();
        usuario.setNome("Leonardo Leitão");
        usuario.setEmail("leonardomleitao@gmail.com");

        IO.println(usuario);
        IO.println(usuario.getId());
        IO.println(usuario.getNome());
        IO.println(usuario.getEmail());
    }
}
