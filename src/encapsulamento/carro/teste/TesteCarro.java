package encapsulamento.carro.teste;

import encapsulamento.carro.model.Carro;

public class TesteCarro {
    static void main() {
        Carro carro = new Carro(5, 245);
        carro.ligar();

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        IO.println(carro);

        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();

        IO.println(carro);
    }
}
