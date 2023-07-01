package br.com.dio;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n Exercicio calculadora");

        Calculadora.somaNumero(8,3);
        Calculadora.subtrairNumero(7, 5);
        Calculadora.multiplicaNumero(6, 4);
        Calculadora.dividirNumero(9, 2.3);

        System.out.println("\n Exercício mensagem");
        Mensagem.horaDiaMensagem(6);
        Mensagem.horaDiaMensagem(14);
        Mensagem.horaDiaMensagem(23);

        System.out.println("\n Exercício empréstimo");
        Emprestimo.valorCalculado(1000, Emprestimo.getDuasParcelas());
        Emprestimo.valorCalculado(1000, Emprestimo.getTresParcelas());

        System.out.println("\n Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);

    }
}
