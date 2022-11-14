//Crie um programa que preencha automaticamente (usando lógica,
//não apenas atribuindo diretamente) um vetor numérico com 10 posições,
//conforme abaixo:
//        9 8 7 6 5 4 3 2 1 0
//        0 1 2 3 4 5 6 7 8 9

package exercicios08.vetores;

public class Exercicio73 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i =9;i >=0;i--) {
            vetor[i] = i;
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        for (int i =0;i < vetor.length;i++) {
            vetor[i] = i;
            System.out.print(vetor[i] + " ");
        }
    }
}
