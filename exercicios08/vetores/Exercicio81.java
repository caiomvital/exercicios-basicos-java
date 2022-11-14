//Crie um programa que leia a idade de 8 pessoas
//e guarde-as em um vetor. No final, mostre:
//a) Qual é a média de idade das pessoas cadastradas
//b) Em quais posições temos pessoas com mais de 25 anos
//c) Qual foi a maior idade digitada (podem haver repetições)
//d) Em que posições digitamos a maior idade

package exercicios08.vetores;

import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[8];

        int media =0;
        int maiorIdade = Integer.MIN_VALUE;
        int posicaoMaior =0;

        for (int i =0;i < vetor.length;i++) {
            System.out.println("Digite a " + (i+1) + "ª idade: ");
            vetor[i] = scan.nextInt();
            media += vetor[i];
            if (vetor[i] > maiorIdade) {
                maiorIdade = vetor[i];
                posicaoMaior = i;
            }
        }
        System.out.println("A média das idades registradas é de " + (media/8));
        for (int i =0;i < vetor.length;i++) {
            if (vetor[i] >=25) {
                System.out.println("A idade registrada na posição " + i + " foi acima de 25 anos.");
            }
        }
        System.out.println("A maior idade registrada foi de " + maiorIdade + " anos.");
        System.out.println("A maior idade foi registrada na posição " + posicaoMaior);
    }
}
