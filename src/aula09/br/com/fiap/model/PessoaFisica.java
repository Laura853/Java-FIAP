package aula09.br.com.fiap.model;

public class PessoaFisica extends Pessoa {
   private Pessoa pessoa;
   private String cpf;
   private String rg;

   //Criar um construtor para chamar o construtor do pai

    public PessoaFisica(String nome){
        super(nome);//chama o construtor do pai
    }

    //Criar um construtor que recebe o nome e cpf
    public PessoaFisica(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
