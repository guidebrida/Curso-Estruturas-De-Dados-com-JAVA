package exercicios.hashmap.ex2;

import java.util.HashMap;
import java.util.Map;

public class ex2 {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();

        hashMap.put(1, "guilherme");
        hashMap.put(2, "gabriel");
        hashMap.put(3, "didye Drogba");
        hashMap.put(4, "ribamar");

        System.out.println("O tamanho do hashmap e: " + hashMap.size());
        hashMap2.putAll(hashMap);


        System.out.println("hashmap2");
        for (Map.Entry x: hashMap2.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }

    }
}
