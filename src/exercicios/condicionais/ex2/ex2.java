package exercicios.condicionais.ex2;

//
//        16. Write a program in Java to display the pattern like right angle triangle with a number. Go to the editor
//
//        Test Data
//        Input number of rows : 10
//        Expected Output :
//
//        1
//        12
//        123
//        1234
//        12345
//        123456
//        1234567
//        12345678
//        123456789
//        12345678910


import java.util.Scanner;

public class ex2 {


    public static void main(String[] args) {

        int i, j;


        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}