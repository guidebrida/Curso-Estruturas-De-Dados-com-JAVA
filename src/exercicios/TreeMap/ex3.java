package exercicios.TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class ex3 {
    public static void main(String[] args) {

        TreeMap<String, String> treeMap = new TreeMap<String, String>();

        treeMap.put("C1", "Red");
        treeMap.put("C2", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C4", "White");

        System.out.println(treeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero:");
        String numero = scanner.next();

        if (treeMap.containsKey(numero)){
            System.out.println("The Tree Map contains key " + numero);
        } else {
            System.out.println("The Tree Map does not contain key");
        }
    }
}
