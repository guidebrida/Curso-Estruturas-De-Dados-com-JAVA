package exercicios.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ex2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("guilherme");
        list.add("mario");
        list.add("junin");
        list.add("bruno");

        for (String element : list) {
            System.out.println(element);
        }
    }
}

