package br.com.dio.collections.streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de string: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        //set não aceita numeros repetidos

        System.out.println("\nTransforme esta lista de string em uma lista de números inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listparesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> (integer % 2 == 0 && integer > 2))
                .collect(Collectors.toList());
        System.out.println(listparesMaioresQue2);

        System.out.println("\n Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);



        List<String> numerosAleatorios2 =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nRemova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios2.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(integer -> integer %2 != 0);
        System.out.println(numerosAleatoriosInteger);
    }
}
