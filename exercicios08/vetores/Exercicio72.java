//Crie um programa que preencha automaticamente (usando lógica,
//não apenas atribuindo diretamente) um vetor numérico com 10 posições,
//conforme abaixo:
//        5 10 15 20 25 30 35 40 45 50
//        0 1 2 3 4 5 6 7 8 9

package exercicios08.vetores;

public class Exercicio72 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i =0;i < vetor.length;i++) {
            vetor[i] =5* (i+1);
        }

        for (int vetores : vetor) {
            System.out.print(vetores + " ");

        }

        System.out.println(" ");

        for (int i =0;i < vetor.length;i++) {
            System.out.print(i + " ");
        }
    }
}
