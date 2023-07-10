package br.com.dio.oo.visibilidade;

public class Classe1 {

    //visto somente dentro da classe
    private String atributo1;

    //dentro da classe subclasse e pacote
    protected String atributo2;

    // em qualquer lugar
    public String atributo3;

    //tudo se aplica a métodos
    private void metodo1() {

    }

    protected void metodo2() {

    }

    public void metodo3() {

    }
}
