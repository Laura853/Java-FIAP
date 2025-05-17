package aula10.fiap.com.br.view;

import aula09.br.com.fiap.model.Endereco;
import aula09.br.com.fiap.model.PessoaFisica;

public class Teste {
    public static void main(String[] args) {
        //Instanciar uma pessoa física
        PessoaFisica pf = new PessoaFisica("Fulano", "12634895");


        //Atribuir valores aos atributos do objeto (fixo)

        pf.setRg("3747498590");
        pf.setIdade(19);


        Endereco endereco = new Endereco();
        endereco.setRua("Avenida Paulista");
        endereco.setNumero("1100");
        pf.setEndereco(endereco);

        //Exibir os valores
        System.out.println(pf.getNome());
        System.out.println(pf.getCpf());
        System.out.println(pf.getRg());
        System.out.println(pf.getIdade());
        System.out.println(pf.getEndereco().getRua() + ", " + pf.getEndereco().getNumero());


    }




}
