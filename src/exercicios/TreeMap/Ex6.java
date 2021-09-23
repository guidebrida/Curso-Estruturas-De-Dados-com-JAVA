package exercicios.TreeMap;

import java.util.TreeMap;

public class Ex6 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("C1", "Red");
        treeMap.put("C2", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C4", "White");

        System.out.println("Original: " + treeMap);
        treeMap.clear();
        System.out.println("Novo: " + treeMap);
    }
}
