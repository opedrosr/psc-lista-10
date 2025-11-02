public class Computador {
    String processador;
    String memoriaRAM;
    String armazenamento;
    String sistemaOperacional;

    public Computador(String processador, String memoriaRAM, String armazenamento, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar() {
        System.out.println("Computador inicializando...");
    }

    public void desligar() {
        System.out.println("Computador desligando...");
    }

    public void processarDados() {
        System.out.println("Processando dados...");
    }

    public void reiniciar() {
        System.out.println("Reiniciando sistema...");
    }
}
