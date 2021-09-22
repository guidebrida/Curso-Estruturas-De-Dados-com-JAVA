package exercicios.condicionais.ex5;

import java.util.Scanner;

// Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row. Go to the editor
//
//         1
//         2 2
//         3 3 3
//         4 4 4 4

public class ex5 {


    public static void main(String[] args) {


        int i, j, numero;
        System.out.print("Insira um numero: ");
        Scanner in = new Scanner(System.in);
        numero = in.nextInt();

        for (i=1;i<=numero;i++){
            for (j=1;j<=i;j++){
                System.out.println(i);
            }
            System.out.println("");
        }

    }

}
