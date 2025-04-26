package aula04.br.com.biblioteca.model;

public class Livro {

    // atributos
    private String titulo;
    private int paginas;
    private boolean disponivel;

    //Construtor
    public Livro(){
        System.out.println("Passei por aqui");

    }

    // métodos
    void emprestar() {
        disponivel = false;
    }

    //Getters e Setters
    //Leitura

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
