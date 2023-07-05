package br.com.dio.collection;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class ExercicioProposto4 {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações:");
        Map<String, Integer> populacaoEstadoNordeste =new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};

        System.out.println(populacaoEstadoNordeste);

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        populacaoEstadoNordeste.put("RN", 3534165);
        System.out.println(populacaoEstadoNordeste);

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: ");
        System.out.println(populacaoEstadoNordeste);
        populacaoEstadoNordeste.put("PB", 4039277);
        System.out.println(populacaoEstadoNordeste);

        System.out.println("\nExiba a população de PE: " + populacaoEstadoNordeste.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informados: ");
        Map<String, Integer> populacaoEstadoNordeste1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};
        System.out.println(populacaoEstadoNordeste1);

        System.out.println("\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNordeste = new TreeMap<>(populacaoEstadoNordeste);
        System.out.println(populacaoEstadosNordeste);

        Collection<Integer> populacao = populacaoEstadoNordeste.values();
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadoNordeste.entrySet()) {
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("\nO estado com menor população %S e sua quantidade: %d\n", estadoMenorPopulacao, Collections.min(populacao));

        Collection<Integer> populacao1 = populacaoEstadoNordeste.values();
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadoNordeste.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao1))) estadoMaiorPopulacao = entry.getKey();
        }
        System.out.printf("\nO estado com maior população %s e sua quantidade: %d\n", estadoMaiorPopulacao, Collections.max(populacao1));


        int soma = 0;
        Iterator<Integer> iterator = populacaoEstadoNordeste.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();

        }
        System.out.println("\nExiba a soma da população deste dicionário de estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma / populacaoEstadoNordeste.size()));

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadoNordeste.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadoNordeste);

        System.out.println("\nApague o dicionário de estados: ");
        populacaoEstadoNordeste.clear();

        System.out.println("\nConfira se o dicionário está vazio: ");
        System.out.println(populacaoEstadoNordeste);


    }
}
