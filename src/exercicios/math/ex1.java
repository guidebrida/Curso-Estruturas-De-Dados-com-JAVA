package exercicios.math;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero:");
        Integer valor1 = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("digite o segundo numero:");
        Integer valor2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Escolha a operação que voce quer fazer: \n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão" );
        Integer soma = scanner3.nextInt();

        switch (soma){
            case 1:
            {
                Integer conta = valor1 + valor2;
                System.out.println("Resultado: " + conta);
                break;
            }
            case 2:{
                Integer conta = valor1 - valor2;
                System.out.println("Resultado: " + conta);
                break;

            }
            case 3:{
                Integer conta = valor1 * valor2;
                System.out.println("Resultado: " + conta);
                break;

            }
            case 4:{
                Integer conta = valor1 / valor2;
                System.out.println("Resultado: " + conta);
                break;

            }
            default:
                System.out.println("erro operação invalida");
                break;
        }


    }
}
