public class Celular {
    String marca;
    String modelo;
    String sistemaOperacional;
    int bateria;

    public Celular(String marca, String modelo, String sistemaOperacional, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.bateria = bateria;
    }

    public Celular(String marca2, int i, String sistemaOperacional2, String string) {
        //TODO Auto-generated constructor stub
    }

    public void ligar() {
        System.out.println("Celular ligado.");
    }

    public void enviarMensagem() {
        System.out.println("Mensagem enviada!");
    }

    public void tirarFoto() {
        System.out.println("Foto capturada!");
    }

    public void fazerLigacao() {
        System.out.println("Fazendo ligação...");
    }
}
