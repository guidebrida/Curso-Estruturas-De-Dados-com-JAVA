package Aulas.pilhas;

public class Aula17 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);

        System.out.println(pilha);


        System.out.println("Desimpilhando elemento");
        pilha.desempilha();
        pilha.desempilha();

        System.out.println(pilha);
    }
}
