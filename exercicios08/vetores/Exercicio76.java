//Crie um programa que preencha automaticamente um vetor numérico
//com 7 números gerados aleatoriamente pelo computador e depois
//mostre os valores gerados na tela.


package exercicios08.vetores;

import java.util.Random;

public class Exercicio76 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int[] vetor = new int[7];

        for (int i =0;i < vetor.length;i++) {
            vetor[i] = gerador.nextInt(26);
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        for (int i =0;i < vetor.length;i++) {
            System.out.print(i + " ");

        }
    }
}
