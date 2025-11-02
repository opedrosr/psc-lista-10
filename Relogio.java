public class Relogio {
    String marca;
    String tipo;
    String cor;
    String material;

    public Relogio(String marca, String tipo, String cor, String material) {
        this.marca = marca;
        this.tipo = tipo;
        this.cor = cor;
        this.material = material;
    }

    public void mostrarHora() {
        System.out.println("Mostrando hora atual...");
    }

    public void despertar() {
        System.out.println("Despertador tocando!");
    }

    public void cronometar() {
        System.out.println("Cronômetro iniciado.");
    }

    public void ajustarHora() {
        System.out.println("Hora ajustada.");
    }
}
