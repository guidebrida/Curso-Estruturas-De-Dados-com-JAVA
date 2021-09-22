package exercicios.condicionais.ex3;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        int i, j, numero;
        System.out.print("Insira um numero: ");
        Scanner in = new Scanner(System.in);
        numero = in.nextInt();

        for (i=1;i<=numero;i++){
            for (j=1;j<numero;j++){
                System.out.println(i);
            }
            System.out.println("");
        }
    }
}
