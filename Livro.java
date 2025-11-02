public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;
    String genero;

    public Livro(String titulo, String autor, int numeroDePaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.genero = genero;
    }

    public void abrir() {
        System.out.println("Livro aberto: " + titulo);
    }

    public void ler() {
        System.out.println("Lendo o livro " + titulo);
    }

    public void marcarPagina() {
        System.out.println("Página marcada!");
    }

    public void fechar() {
        System.out.println("Livro fechado.");
    }
}
