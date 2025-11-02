public class Animal {
    String especie;
    String cor;
    double peso;
    String idade;

    public Animal(String especie, String cor, double peso, String idade) {
        this.especie = especie;
        this.cor = cor;
        this.peso = peso;
        this.idade = idade;
    }

    public void correr() {
        System.out.println("O " + especie + " está correndo.");
    }

    public void comer() {
        System.out.println("O " + especie + " está comendo.");
    }

    public void dormir() {
        System.out.println("O " + especie + " está dormindo.");
    }

    public void emitirSom() {
        System.out.println("O " + especie + " está emitindo som.");
    }
}

