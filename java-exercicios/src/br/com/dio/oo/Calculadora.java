package br.com.dio.oo;

//implementando todos os métodos dentro da interface
public class Calculadora implements OperacaoMatematica{
    //filosofia de interface, você obrigar a um terceira a
    //implementar os métodos que você vai chamar dentro de algum processamento seu


    //sobrescreveu
    @Override
    public void soma(double operando1, double operando2) {

        System.out.println("Soma: " + (operando1 + operando2));
    }

    @Override
    public void subtraco(double operando1, double operando2) {

        System.out.println("Subtração: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {

        System.out.println("Multiplicação: " + (operando1 * operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {

        System.out.println("Divisão: " + (operando1 / operando2));
    }
}
