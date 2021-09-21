package Aulas.fila;

public class Aula24 {

    public static void main(String[] args) {

        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileira(new Paciente("Guilherme", 2));

        fila.enfileira(new Paciente("Luis", 1));

        fila.enfileira(new Paciente("Mario", 3));

        System.out.println(fila);
    }
}
