public class Principal {
    public static void main(String[] args) {
            Pessoa p1 = new Pessoa("Pedro", 22, "123.456.789-00", "pedro@gmail.com");
            Carro c1 = new Carro("Honda", "Civic", "Preto", 2018);
            Cachorro dog = new Cachorro("Felca auau", "Labrador", 5, "Amarelo");
            Livro l1 = new Livro("Assim falou zaratustra", "Nietzshe", 200, "Filosofico");
            Animal especie = new Animal("Raposa", "Larajna", 2, "5 anos");
            Bicicleta modelo = new Bicicleta("Preta", "BMX", 29, 5);
            Celular marca = new Celular("iphone", 2025, "ios", "100%");
            Computador sistemaOperacional = new Computador("intel core i5", "8GB", "1TB", "windows");
            Relogio tipo = new Relogio("Omega", "Analógico", "prata", "aço inoxidável");
            Televisao tamanho = new Televisao("Samsung", "50 polegadas", "4k", "LED");
            
        
                p1.comer();
                c1.acelerar();
                dog.dormir();
                l1.marcarPagina();
                especie.comer();
                modelo.pedalar();
                marca.ligar();
                sistemaOperacional.processarDados();
                tipo.mostrarHora();
                tamanho.ajustarVolume();
    }
}
