//Crie uma lógica que preencha um vetor de 20 posições
//com números aleatórios (entre 0 e 99) gerados pelo computador.
//Logo em seguida, mostre os números gerados e depois
//coloque o vetor em ordem crescente, mostrando no final os valores ordenados.

package exercicios08.vetores;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio83 {
    public static void main(String[] args) {

        int[] vetor = new int[20];

        for (int i =0;i < vetor.length;i++) {
            int random = ThreadLocalRandom.current().nextInt(0,99+1);
            vetor[i] = random;
        }
        System.out.println(Arrays.toString(vetor));
        Arrays.sort(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
