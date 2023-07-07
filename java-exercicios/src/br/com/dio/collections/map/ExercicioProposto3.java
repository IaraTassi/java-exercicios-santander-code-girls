package br.com.dio.collections.map;

import java.util.*;

/*
Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato)

id = 1 - Contato = nome: João, numero: 99999999;
id = 2 - Contato = nome: José, numero: 98888888;
id = 3 - Contato = nome: Maria, numero: 97777777;
id = 4 - Contato = nome: Laura, numero: 96666666;
id = 5 - Contato = nome: Débora, numero: 95555555;

 */
public class ExercicioProposto3 {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(2, new Contato("João", 99999999));
            put(5, new Contato("José", 98888888));
            put(4, new Contato("Maria", 97777777));
            put(3, new Contato("Laura", 96666666));
            put(1, new Contato("Débora", 95555555));

        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());

        }

        System.out.println("\nOrdem inserção: ");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(2, new Contato("João", 99999999));
            put(5, new Contato("José", 98888888));
            put(4, new Contato("Maria", 97777777));
            put(3, new Contato("Laura", 96666666));
            put(1, new Contato("Débora", 95555555));


        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());

        }

        System.out.println("\nOrdem de id: ");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());

        }

        System.out.println("\nOrdem número telefone: ");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }

        System.out.println("\nOrdem nome contato: ");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNome());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());

        }

    }
}

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNome implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}