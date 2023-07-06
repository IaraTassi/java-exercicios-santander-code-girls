package br.com.dio.collections.map;


import java.util.*;

/*
Daso os modelos dos carros e seus respctivos consumos na estrada, faça
modelo = gol - consumo = 14.4km/l
modelo = uno - consumo = 15.6km/l
modelo = mobi - consumo = 16.1km/l
modelo = hb20 - consumo = 14.5km/l
modelo = kwid - consumo = 15.6km/l
modelo e a chave (key) e consumo valor (value)
 */
public class ExemplosMap {

    public static void main(String[] args) {


        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            
        }};
        //por usar um hashmap ele inseriu de forma aleatória
        System.out.println(carrosPopulares.toString());

        //como já temos a chave gol vamos substituir o valor com o put
        System.out.println("\nSubstitua o consumo do gol por 15.2km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        //tucson e a chave então o metódo containKey
        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        //para passar a chave e retornar o valor usamos metódo get
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //como no set não temos metódo para mostrar então usamos o metódo keyset
        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        //vamos usar o metódo values que retorna uma collections
        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        //temos que saber o valor da chave mais eficiente, como retornar
        // o mais valor de uma chave.
        // o values retorna uma colletions com todos so consumos
        //agora temos que trabalhar com chave e valor para isso usamos
        //metódo entruSet, inrteface Entry tem getkey e getvalue
        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        //Trabalhamos com o set, metódo value e interator
        //Exiba a soma dos consumos
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma dos consumos: " + soma);

        System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

        System.out.println(carrosPopulares);
        System.out.println("\nRemova os modelos com o consumo igual a 15.6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        //vamos usar o linkedHashMap
        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        //por usar um LinkedHashMap ele informa na forma de inserção
        System.out.println(carrosPopulares1.toString());

        //vamos criar um treeMap que ordena a chave string ordem alfabetica
        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        //metódo clear, vamos apagar o primeiro
        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();

        //metódo retorna um boolean isEmpty
        System.out.println("\nConfira se a lista está vazia: " + carrosPopulares.isEmpty());






    }

}
