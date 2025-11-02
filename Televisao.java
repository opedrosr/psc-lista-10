public class Televisao {
    String marca;
    String tamanho;
    String resolucao;
    String tipoDeTela;

    public Televisao(String marca, String tamanho, String resolucao, String tipoDeTela) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.tipoDeTela = tipoDeTela;
    }

    public void ligar() {
        System.out.println("TV ligada.");
    }

    public void desligar() {
        System.out.println("TV desligada.");
    }

    public void trocarCanal() {
        System.out.println("Canal trocado.");
    }

    public void ajustarVolume() {
        System.out.println("Volume ajustado.");
    }
}
