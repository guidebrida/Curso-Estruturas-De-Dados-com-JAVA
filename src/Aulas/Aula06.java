package Aulas;

import Vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");//0
        vetor.adiciona("elemento 2");//1
        vetor.adiciona("elemento 3");//2

        System.out.println(vetor.busca("elemento 2"));
        System.out.println(vetor.busca("elemento 24"));
        System.out.println(vetor.busca("elemento 4"));
    }
}