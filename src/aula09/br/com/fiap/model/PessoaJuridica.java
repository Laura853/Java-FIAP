package aula09.br.com.fiap.model;

public class PessoaJuridica extends Pessoa {
     private Pessoa pessoa;
     private String cnpj;
     private boolean ativo;

    public PessoaJuridica(String nome){
        super(nome);
    }


     public PessoaJuridica(String nome, String cnpj){
         super (nome);
         this.cnpj = cnpj;
     }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
