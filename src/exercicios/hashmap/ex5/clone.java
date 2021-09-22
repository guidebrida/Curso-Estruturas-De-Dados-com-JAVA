package exercicios.hashmap.ex5;

import java.util.HashMap;
import java.util.Map;

public class clone {
    public static void main(String[] args) {


        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Blue");

        for (Map.Entry x: hashMap.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();

        hashMap2 = (HashMap) hashMap.clone();

        for (Map.Entry x: hashMap2.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }

    }


}
