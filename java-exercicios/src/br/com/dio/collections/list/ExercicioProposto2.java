package br.com.dio.collections.list;

import java.util.*;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime, as perguntas são
1 "Telefonou para a vítima?"
2 "Esteve no local do crime?"
3 "Mora perto da vítima?"
4 "Devia para a vítima?"
5 "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente"
 */
public class ExercicioProposto2 {
    public static void main(String[] args) {


        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para a vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) {
            String resp = contador.next();
            if (resp.contains("s")) {
                count ++;

            }
        }

        switch (count) {
            case 2:
                System.out.println(" Suspeito(a)! ");
                break;
            case 3:
                System.out.println(" Cúmplice! ");
                break;
            case 4:
            case 5:
                System.out.println(" Assasino(a)!! ");
                break;
            default:
                System.out.println(" Inocente! ");
        }
    }
}
