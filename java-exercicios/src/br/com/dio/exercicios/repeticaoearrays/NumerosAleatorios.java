package br.com.dio.exercicios.repeticaoearrays;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor, ao final mostre os números e seus sucessores.
 */
public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int [20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");

        }

        System.out.println("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1) + " ");

        }
        //Exemplo antecessor
        //System.out.println("\nAntecessor dos Números Aleatórios: ");
        //for (int numero : numerosAleatorios) {
        //    System.out.println((numero - 1) + " ");

        //}
    }
}
