package aula08.br.com.fiap;

import javax.swing.*;

public class Teste {

    public static void main(String[] args) {
        //Criar uma calculadora com as operações +, -, / e *

        //Usuário informa um  número, a operação que será realizada e o outro número
        //Ler o primeiro número
        String valor = JOptionPane.showInputDialog("Digite um número");
        double n1 = Double.parseDouble(valor); // converte a String em um double

        //Ler o operador
        String operador = JOptionPane.showInputDialog("Digite a operação (+, -, /, *)");

        //Ler o segundo número

        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));

        //Calcular resultado
        double resultado = 0;

        switch (operador){
            case "+" :
                resultado = n1 + n2;
                break;
            case "-" :
                resultado = n1 - n2;
                break;
            case "/" :
                resultado = n1 / n2;
                break;
            case "*" :
                resultado = n1 * n2;
            default:
                System.out.println("Operador inválido");
        }

        System.out.println("Resultado " + resultado);



    }
}
