package br.com.dio.exercicios.metodos;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;

    }

    public static int getTresParcelas() {
        return 3;

    }

    public static double getTaxaDuasParcelas() {
        return 0.2;

    }

    public static double getTaxaTresParcelas() {
        return 0.4;

    }

    public static void valorCalculado(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor do empréstimo duas parcelas R$ " + valorFinal);

        }else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor do empréstimo três parcelas R$ " + valorFinal);

        }else {
            System.out.println("Quantidade de parcelas inválida");
        }
    }
}
