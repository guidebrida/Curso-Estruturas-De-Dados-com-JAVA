package exercicios.TreeMap;

import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args) {

        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("C1", "guilherme");
        treeMap.put("C2", "João");
        treeMap.put("C3", "Jose");
        treeMap.put("C4", "Pedro");
        treeMap.put("C5", "Luigi");

        System.out.println("Tree map 1: " + treeMap);
        TreeMap<String, String> treeMap2 = new TreeMap<String, String>();

        treeMap2.put("A1", "Mariano");
        treeMap2.put("A2", "Luciano");
        System.out.println("Tree map 2: " + treeMap2);
        treeMap.putAll(treeMap2);
        System.out.println("Depois de copiar : " + treeMap);
    }
}
