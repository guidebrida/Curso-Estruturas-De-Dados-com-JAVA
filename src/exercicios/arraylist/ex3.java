package exercicios.arraylist;

import java.util.ArrayList;

public class ex3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Guilherme");
        arrayList.add("Joao");
        arrayList.add("Mario");
        arrayList.add("Pedro");
        arrayList.add("Paulo");

        System.out.println(arrayList);

        arrayList.add(0, "ricardo");
        arrayList.add(5, "Sergio");

        System.out.println(arrayList);

    }
}
