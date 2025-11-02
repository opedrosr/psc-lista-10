public class Cachorro {
    String nome;
    String raca;
    int idade;
    String cor;

    public Cachorro(String nome, String raca, int idade, String cor) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
    }

    public void latir() {
        System.out.println(nome + " está latindo!");
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public void brincar() {
        System.out.println(nome + " está brincando.");
    }
}
