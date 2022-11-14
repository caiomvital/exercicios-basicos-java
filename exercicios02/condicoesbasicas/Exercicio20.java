//Desenvolva um programa que leia um número inteiro
//e mostre se ele é PAR ou ÍMPAR.

package exercicios02.condicoesbasicas;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = scan.nextInt();
        if(numero %2==0) {
            System.out.printf("O número %d é par.",numero);
        } else {
            System.out.printf("O número %d é ímpar.",numero);
        }
    }
}
