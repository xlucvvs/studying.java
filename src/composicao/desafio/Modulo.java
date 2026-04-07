package composicao.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Modulo {
    UUID id;
    String nome;
    final List<Aula> aulas = new ArrayList<>();

    public Modulo(String nome) {
        this(UUID.randomUUID(), nome);
    }

    public Modulo(UUID id, String nome) {
        this.nome = nome;
        this.id = id;
    }

    int getDuracaoTotal() {
        int total = 0;
        for(Aula aula: aulas) {
            total += aula.duracaoEmSegundos;
        }
        return total;
    }
}
