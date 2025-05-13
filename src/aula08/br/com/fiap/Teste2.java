package aula08.br.com.fiap;

import java.util.IllegalFormatCodePointException;

public class Teste2 {
    public static void main(String[] args) {

        String email = "antonella@lizmacedo.com";
        String confirmacaoEmail = new String("antonella@lizmacedo.com");

        //Validar se os emails são iguais

        if (email.equalsIgnoreCase(confirmacaoEmail)){
            System.out.println("Email confirmado!");
        } else {
            System.out.println("Emails não são iguais");
        }

        System.out.println(email);
        System.out.println(confirmacaoEmail);


        //Retornar a posição do @ do email

        System.out.printf("Posição: " + email.indexOf("@"));

        //Imprimir a quantidade de caracteres do e-mail

        System.out.printf("Quantidade de caracteres: " + email.length());

        //Exibir o email (sem o dominio)

        System.out.printf(" " + email.substring(0,9));

        //Exibir o dominio do email

        System.out.printf(" " + email.substring(9,23));


    }
}
