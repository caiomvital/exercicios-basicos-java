//Crie um programa que preencha automaticamente (usando lógica,
//não apenas atribuindo diretamente) um vetor numérico
//com 15 posições com os primeiros elementos da sequência de Fibonacci:
//        1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
//        0 1 2 3 4 5 6 7 8 9 10 11 12 13 14

package exercicios08.vetores;

public class Exercicio75 {
    public static void main(String[] args) {

        int num1 =1;
        int num2 =0;
        int[] vetor = new int[15];

        for (int i =0;i < vetor.length;i++) {

            vetor[i] = num1;

            num1 = num1 + num2;
            num2 = num1 - num2;

            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        for (int i =0;i < vetor.length;i++) {

            System.out.print(i + " ");

        }
    }
}
