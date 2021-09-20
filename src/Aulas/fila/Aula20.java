package Aulas.fila;

public class Aula20 {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);
        fila.enfileira(6);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
        System.out.println(fila);


    }
}
