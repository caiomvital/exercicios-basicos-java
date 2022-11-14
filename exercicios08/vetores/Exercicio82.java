//Faça um algoritmo que leia a nota de 10 alunos de uma turma
//e guarde-as num vetor. No final, mostre:
//a) Qual é a média da turma
//b) Quantos alunos estão acima da média da turma
//c) Qual foi a maior nota digitada
//d) Em que posições a maior nota aparece

package exercicios08.vetores;

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notas = new double[10];
        double media =0;
        int acimaDaMedia =0;
        double maiorNota = Double.MIN_VALUE;


        for (int i =0;i < notas.length;i++) {
            System.out.println("Digite a " + (i+1) + "ª nota: ");
            notas[i] = scan.nextDouble();
            media += notas[i];
            if(notas[i] > maiorNota) {
                maiorNota = notas[i];
            }

        }
        System.out.println("A média das notas da turma é de " + (media /10));

        for (int i =0;i < notas.length;i++) {
            if (notas[i] >= maiorNota) {
                System.out.println("A maior nota apareceu na " + i + "ª posição.");
            }
            if (notas[i] >= (media /10)) {
                acimaDaMedia++;
            }
        }
        System.out.println(acimaDaMedia + " alunos estão acima da média.");
    }
}
