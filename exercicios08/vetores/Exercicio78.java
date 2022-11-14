//Escreva um programa que leia 15 números e guarde-os em um vetor.
//No final, mostre o vetor inteiro na tela e em seguida mostre
//em que posições foram digitados valores que são múltiplos de 10.

package exercicios08.vetores;

import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[15];

        for (int i =0;i < vetor.length;i++) {
            System.out.println("Digite um número");
            vetor[i] = scan.nextInt();

        }

        for (int i =0;i < vetor.length;i++) {
            if(vetor[i] %10==0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é múltiplo de 10.");
            }

        }
    }
}
