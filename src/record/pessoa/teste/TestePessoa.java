package record.pessoa.teste;

import record.pessoa.model.Pessoa;

public class TestePessoa {
    static void main() {
        Pessoa p1 = new Pessoa("João", 40);
        Pessoa p2 = new Pessoa("João", 40);

        IO.println(p1);
        IO.println(p1.nome());
        IO.println(p1.idade());

        IO.println(p1.equals(p2));
    }
}
