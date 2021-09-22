package exercicios.condicionais.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero:");
        int numero = scanner.nextInt();

        if (numero>0){
            System.out.println("numero positivo");
        }
        else{
            System.out.println("numero negativo");
        }



    }
}
