package br.com.dio.oo.heranca;

class RodarAplicacao {
    public static void main(String[] args) {

        //foi pego um classe e instancio o objeto nela
        Funcionario funcionario = new Funcionario();

        //classe mãe e três upcast implicito
        //neste caso nõa se perde dados
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //temos downcast (Funcionario classe mãe),
        // para Vendedor downcast explicito
        // dá erro pois perde dados, vendedor e uma classe
        // não é um objeto, erro classCastException
        //Vendedor vendedor1 = (Vendedor) new Funcionario();

    }
}
