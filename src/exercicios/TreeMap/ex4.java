package exercicios.TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class ex4 {
    public static void main(String[] args) {

        TreeMap<String, String> treeMap = new TreeMap<String, String>();

        treeMap.put("C1", "Red");
        treeMap.put("C2", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C4", "White");

        System.out.println(treeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor:");
        String valor = scanner.next();

        if (treeMap.containsValue(valor)){
            System.out.println("The Tree Map contains key " + valor);
        } else {
            System.out.println("The Tree Map does not contain key");
        }
    }
}

