package br.com.dio;

public class Calculadora {

    public static void somaNumero(int numero1, int numero2) {

        int resultado = numero1 + numero2;
        System.out.println("Resultado da soma " + numero1 + " mais " + numero2 + " é " + resultado);

    }

    public static void subtrairNumero(int numero1, int numero2) {

        int resultado = numero1 - numero2;

        System.out.println("Resultado da subtração " + numero1 + " menos " + numero2 + " é " + resultado);

    }

    public static void multiplicaNumero(int numero1, int numero2) {

        int resultado = numero1 * numero2;

        System.out.println("Resultado da multiplicação " + numero1 + " por " + numero2 + " é " + resultado);

    }

    public static void dividirNumero(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("Resultado da divisão " + numero1 + " por " + numero2 + " é " + resultado);

    }
}
