package br.com.dio.collections.map;

import java.util.*;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido.
 */
public class ExercicioProposto2 {
    public static void main(String[] args) {

        int quantidadeLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random geraLancamento = new Random();
        for (int i = 0; i < quantidadeLancamentos; i++) {
            int numero = geraLancamento.nextInt(6) + 1;
            valores.add(numero);
        }
        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if (lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            else lancamentos.put(resultado, 1);

        }

        System.out.print("Jogando");
         for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("Jogando");
        System.out.println("\nValor: " + "Quantidade de vezes: ");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d\n %10d\n", entry.getKey(), entry.getValue());
        }
    }

}
