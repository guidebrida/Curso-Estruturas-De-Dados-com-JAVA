package exercicios.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class ex5 {
    public static void main(String[] args) {

        TreeMap<String,String> tree_map1=new TreeMap<String,String>();

        tree_map1.put("C1", "Red");
        tree_map1.put("C2", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C4", "White");

        Set<String> keys = tree_map1.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
}
