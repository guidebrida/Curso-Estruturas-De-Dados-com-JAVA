package exercicios.condicionais.ex4;

//8. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like :
//        1
//        2 3
//        4 5 6
//        7 8 9 10


import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {


        int i, j, numero, somatorio=1;
        System.out.print("Insira um numero: ");
        Scanner in = new Scanner(System.in);
        numero = in.nextInt();

        for (i=1;i<=numero;i++){
            for (j=1;j<=i;j++)
            System.out.println(somatorio++);
            System.out.println("");

        }
    }


}
