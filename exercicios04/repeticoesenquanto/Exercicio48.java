//Faça um programa que leia 7 números inteiros e no final
//mostre o somatório entre eles.

package exercicios04.repeticoesenquanto;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador =0;
        int soma =0;

        while (contador <7) {
            System.out.println("Digite o " + (contador +1) + "º número: ");
            int i = scan.nextInt();
            soma += i;
            contador++;
        }
        System.out.println("A soma dos números inseridos é " + soma);

    }
}
