package exercicios.condicionais.ex6;

import java.util.Scanner;

public class ex6 {


    public static void main(String[] args) {


        int i, j, numero, somatorio=1;
        System.out.print("Insira um numero: ");
        Scanner in = new Scanner(System.in);
        numero = in.nextInt();

        for (i = 1; i <= numero; i++) {
            for (j = 1; j <= i; j++) {
                System.out.println(somatorio);
                somatorio++;
            }
            System.out.println("");
        }

    }
}

