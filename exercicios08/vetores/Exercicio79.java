//Desenvolva um programa que leia 10 números inteiros
//e guarde-os em um vetor. No final, mostre quais são
//os números pares que foram digitados e em que posições
//eles estão armazenados.


package exercicios08.vetores;

import java.util.Scanner;

public class Exercicio79 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i =0;i < vetor.length;i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scan.nextInt();
        }
        System.out.println();
        for (int i =0;i < vetor.length;i++) {
            if(vetor[i] %2==0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é par.");
            }
        }
    }
}
