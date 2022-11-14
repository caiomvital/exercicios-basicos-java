//Faça um algoritmo que preencha um vetor de 30 posições com números
//entre 1 e 15 sorteados pelo computador. Depois disso, peça
//para o usuário digitar um número (chave) e seu programa deve mostrar
//em que posições essa chave foi encontrada.
//Mostre também quantas vezes a chave foi sorteada.

package exercicios08.vetores;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random;
        int chave;
        int vezesChave =0;
        int[] vetor = new int[30];

        for (int i =0;i < vetor.length;i++) {
            random = ThreadLocalRandom.current().nextInt(1,15+1);
            vetor[i] = random;
        }

        System.out.println("Digite a chave: ");
        chave = scan.nextInt();

        for (int i =0;i < vetor.length;i++) {
            if (vetor[i] == chave) {
                System.out.println("A chave apareceu na posição " + i + " do vetor.");
                vezesChave++;
            }
        }
        System.out.println("A chave apareceu " + vezesChave + " vezes.");
    }
}
