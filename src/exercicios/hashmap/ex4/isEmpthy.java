package exercicios.hashmap.ex4;

import java.util.HashMap;

public class isEmpthy {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Blue");

        boolean vazio = hashMap.isEmpty();
        System.out.println("O hashmap esta vazio: " + vazio);

        hashMap.clear();
        vazio = hashMap.isEmpty();
        System.out.println("O hashmap esta vazio: " + vazio);


    }


}
