package br.com.dio;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercicio calculadora");

        Calculadora.somaNumero(8,3);
        Calculadora.subtrairNumero(7,5);
        Calculadora.multiplicaNumero(6,4);
        Calculadora.dividirNumero(9,2.3);

        System.out.println("Exercício mensagem");
        Mensagem.horaDiaMensagem(6);
        Mensagem.horaDiaMensagem(14);
        Mensagem.horaDiaMensagem(23);
    }
}
