package br.com.dio.exercicios.metodos;

public class Mensagem {

    public static void horaDiaMensagem(int hora) {

        switch (hora) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemManha();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                mensagemNoite();
                break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                horaInvalida();
                break;
            default:
                System.out.println("Hora inválida");
                break;
        }
    }

    public static void mensagemManha() {

        System.out.println("Bom dia");
    }

    public static void mensagemTarde() {

        System.out.println("Boa tarde");
    }

    public static void mensagemNoite() {

        System.out.println("Boa noite");
    }

    public static void horaInvalida() {

        System.out.println("Hora inválida");
    }
}

