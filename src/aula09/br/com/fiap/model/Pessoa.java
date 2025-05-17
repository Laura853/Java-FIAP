package aula09.br.com.fiap.model;

public class Pessoa {

   private String nome;
   private int idade;
   private Endereco Endereco;


    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public aula09.br.com.fiap.model.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(aula09.br.com.fiap.model.Endereco endereco) {
        Endereco = endereco;
    }
}
