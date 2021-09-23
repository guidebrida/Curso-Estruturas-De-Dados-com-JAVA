package exercicios.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Ex1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "guilherme");
        treeMap.put(2, "João");
        treeMap.put(3, "Jose");
        treeMap.put(4, "Pedro");
        treeMap.put(5, "Luigi");

     //   System.out.println(treeMap);

        for (Map.Entry<Integer,String> entry : treeMap.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
