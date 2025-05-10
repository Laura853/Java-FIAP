package aula08.br.com.fiap;

import java.util.IllegalFormatCodePointException;

public class Teste2 {
    public static void main(String[] args) {

        String email = "antonella@lizmacedo.com";
        String confirmacaoEmail = new String("antonella@lizmacedo.com");

        //Validar se os emails são iguais

        if (email.equals(confirmacaoEmail)){
            System.out.println("Email confirmado!");
        } else {
            System.out.println("Emails não são iguais");
        }

        System.out.println(email);
        System.out.println(confirmacaoEmail);

    }
}
