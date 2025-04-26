package aula04.br.com.biblioteca.view;

import aula04.br.com.biblioteca.model.Livro;

public class Principal {
    public static void main(String[] args) {
        // Instanciar um livro
        Livro livro = new Livro();
        // Atribuir um título ao livro
        livro.setTitulo(); = "Java como programar";
        System.out.println(Livro.getTitulo());

        
    }
}
