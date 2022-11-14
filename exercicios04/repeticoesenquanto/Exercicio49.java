//Crie um programa que leia 6 números inteiros e no final
//mostre quantos deles são pares e quantos são ímpares.

package exercicios04.repeticoesenquanto;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int par =0;
        int impar =0;
        int contador =0;
        int i =0;

        while (contador <6) {
            System.out.println("Digite um número: ");
            i = scan.nextInt();
            if (i %2==0) {
                par++;
            } else {
                impar++;
            }
            contador++;
        }
        System.out.println("A quantidade de números pares é " + par);
        System.out.println("A quantidade de números ímpares é " + impar);
    }
    }
