package aula06.br.com.fiap.loja.model;

public class Funcionario {

    //Atributos
    private String nome;
    private String matricula;
    private double salario;
    private Profissao profissao;

  //Construtor

    public Funcionario(String matricula){
        this.matricula = matricula;
    }

    public Funcionario(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public Funcionario(String matricula, String nome, Profissao profissao){
        this.matricula = matricula;
        this.nome = nome;
        this.profissao = profissao;
    }


   //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}


