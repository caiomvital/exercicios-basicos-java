//Faça um algoritmo que leia a idade de vários alunos de uma turma.
//O programa vai parar quando for digitada a idade 999. No final,
//mostre quantos alunos existem na turma e qual é a média de idade do grupo.

package exercicios05.enquantocomflag;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        int totalIdade =0;
        int media;
        int contador =0;

        do {
            System.out.println("Digite a idade de um aluno: ");
            idade = scan.nextInt();

            if(idade !=999) {
                totalIdade += idade;
                contador++;
                System.out.println("Entre com a idade 999 para encerrar o programa.");
            }

        } while (idade !=999);

        media = totalIdade / contador;
        System.out.println("Você encerrou o programa.");
        System.out.printf("Foram inseridos %d alunos na turma.",contador);
        System.out.println("A média de idade foi de " + media);
    }
}
