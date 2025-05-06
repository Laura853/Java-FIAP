package aula07.br.com.fiap.exercicio.view;

import aula07.br.com.fiap.exercicio.model.Pessoa;

import java.util.Scanner;

public class TesteTamanho {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados primeira pessoa");

        System.out.println("Digite o nome da primeira pessoa:");

        String nomePessoa1 = scanner.nextLine();

        System.out.println("Digite a altura da primeira pessoa:");
        float alturaPessoa1 = Float.parseFloat(scanner.nextLine());

        System.out.println("Digite o peso da primeira pessoa:");
        float pesoPessoa1 = Float.parseFloat(scanner.nextLine());


        System.out.println("Dados segunda pessoa");

        System.out.println("Digite o nome da segunda pessoa:");

        String nomePessoa2 = scanner.nextLine();

        System.out.println("Digite a altura da segunda pessoa:");
        float alturaPessoa2 = Float.parseFloat(scanner.nextLine());

        System.out.println("Digite o peso da segunda pessoa:");
        float pesoPessoa2 =  Float.parseFloat(scanner.nextLine());

        Pessoa pessoa1 = new Pessoa(nomePessoa1, alturaPessoa1, pesoPessoa1);
        Pessoa pessoa2 = new Pessoa(nomePessoa2, alturaPessoa2, pesoPessoa2);

        if(pessoa1.getPeso() > pessoa2.getPeso()){
            System.out.println(pessoa1.getNome() + " é mais pesada que " + pessoa2.getNome());
        } else {
            System.out.println(pessoa2.getNome() + " é mais pesada que " + pessoa1.getNome());
        }

        if(pessoa1.getAltura() > pessoa2.getAltura()){
            System.out.println(pessoa1.getNome() + " é maior que " + pessoa2.getNome());
        } else {
            System.out.println(pessoa2.getNome() + " é maior que " + pessoa1.getNome());
        }

        
    }
}
