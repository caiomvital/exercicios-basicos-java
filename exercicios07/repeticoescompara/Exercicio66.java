//Escreva um programa que leia um número qualquer e mostre
//a tabuada desse número, usando a estrutura “para”.
//Ex: Digite um valor: 5
//        5 x 1 = 5
//        5 x 2 = 10
//        5 x 3 = 15 ...

package exercicios07.repeticoescompara;

import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }
    }
}
