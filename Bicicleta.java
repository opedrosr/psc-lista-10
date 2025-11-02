public class Bicicleta {
    String cor;
    String modelo;
    int tamanho;
    int numeroDeMarchas;

    public Bicicleta(String cor, String modelo, int tamanho, int numeroDeMarchas) {
        this.cor = cor;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public void pedalar() {
        System.out.println("Pedalando a bicicleta...");
    }

    public void frear() {
        System.out.println("Bicicleta freando.");
    }

    public void virar() {
        System.out.println("Virando à esquerda...");
    }

    public void estacionar() {
        System.out.println("Bicicleta estacionada.");
    }
}
