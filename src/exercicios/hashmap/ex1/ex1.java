package exercicios.hashmap.ex1;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "guilherme");
        hashMap.put(2, "gabriel");
        hashMap.put(3, "didye Drogba");
        hashMap.put(4, "ribamar");

        for (Map.Entry x: hashMap.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        //System.out.println(hashMap);
    }
}
