//Faça um programa que preencha automaticamente um vetor numérico
//com 8 posições, conforme abaixo:
//        999 999 999 999 999 999 999 999
//        0 1 2 3 4 5 6 7

package exercicios08.vetores;

public class Exercicio71 {
    public static void main(String[] args) {

        int[] vetor = new int[8];

        for (int i =0;i <8;i++) {
            vetor[i] =999;
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        for (int i =0;i <8;i++) {
            System.out.print(i + " ");
        }
    }
}
