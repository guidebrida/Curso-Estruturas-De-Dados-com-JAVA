package exercicios.hashmap.ex3;

import java.util.HashMap;

public class hashmapClear {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "guilherme");
        hashMap.put(2, "joaozin");
        hashMap.put(3, "matheus");

        System.out.println("original: " + hashMap);

        hashMap.clear();
        System.out.println("limpeza: " + hashMap);
    }
}
