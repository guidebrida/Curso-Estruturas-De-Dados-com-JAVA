package Aulas;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList);

        arrayList.add(0, "D");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");
        if (existe){
            System.out.println("elemento existe");
        }
        else{
            System.out.println("elemento não existe");
        }
        int pos = arrayList.indexOf("D");
        if (pos > -1){
            System.out.println("elemento existe no array na posição " + pos);
        }
        else {
            System.out.println("Elemento não existe no array");
        }
        System.out.println(arrayList.get(2));

        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println("Tamanho da array: " + arrayList.size());

    }
}
