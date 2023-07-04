package br.com.dio.collection;

/*
Dadas as seguintes informações spbre meus livros favoritos e seus autores,
Crie um dicionário e ordene este dicionário exibindo?
Nome Autor - Nome Livro
Autor = Austen, Jane - Livro = Orgulho e preconceito - páginas = 336
Autor = Zusak, Markus - Livro = A menina que roubava livros - páginas = 480
Autor = Simons, Paullina - Livro = O cavaleiro de Bronze: Leningrado - páginas = 504


 */

import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        //ordem aleatória hasMap, para trabalhar com elementos separadamente
        // usamos entrySet e for para imprimir a chave e o valor só o nome
        //getKey valor da chave, nome do livro getValue, GetNome
        System.out.println("Ordem aleatória: ");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Austen, Jane", new Livro("Orgulho e preconceito", 336));
            put("Zusak, Markus", new Livro("A menina que roubava livros", 480));
            put("Simons, Paullina", new Livro("O cavaleiro de Bronze: Leningrado", 504));

        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //para ordem de inserção usamos linkedHashMap
        System.out.println("\nOrdem de Inserção: ");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Austen, Jane", new Livro("Orgulho e preconceito", 336));
            put("Zusak, Markus", new Livro("A menina que roubava livros", 480));
            put("Simons, Paullina", new Livro("O cavaleiro de Bronze: Leningrado", 504));

        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //diacordo com as chaves utilizar o treeMap
        System.out.println("\nOrdem alfabética dos autores: ");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //nomes dos livros estão no valor para isso precisa de treeSet
        //para passar um comparator criamos class comparator e implementamos o metódo
        System.out.println("\nOrdem alfabética dos nomes dos livros: ");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }
}
class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    //vamos sobscrever os metódos equals and hashCode e toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}



