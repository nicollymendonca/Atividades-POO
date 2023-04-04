package Contador;

public class Main {
    public static void main(String[] args) {
        Contador co = new Contador(5);

        System.out.println("Esse é o valor: " +co.getNu());
        co.Incrementar();

        System.out.println("Esse é o valor incrementado: " + co.getNu());

        System.out.println("O valor será zerado!!");
        co.Zerar();

        System.out.println("Esse é o valor zerado: " + co.getNu());
    }
}
