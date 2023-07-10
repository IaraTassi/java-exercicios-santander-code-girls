package br.com.dio.oo.polimosfismo;

public class RodarAplicacao {
    public static void main(String[] args) {

        ClassMae[] classes = new ClassMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClassMae()};

        //dois comportamentos polimorficos
        for (ClassMae classe: classes) {
            classe.metodo1();

        }

        System.out.println("");

        //não tem polimorfismo, tem polimorfismo e não tem polimorfismo
        for (ClassMae classe: classes) {
            classe.metodo2();

        }

        System.out.println("");

        //sobrescrita pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();

    }
}
