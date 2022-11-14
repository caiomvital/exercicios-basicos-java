//Crie um programa que leia duas notas de um aluno
//e calcule a sua média, mostrando uma mensagem no final,
//de acordo com a média atingida:
//- Média até 4.9: REPROVADO
//- Média entre 5.0 e 6.9: RECUPERAÇÃO
//- Média 7.0 ou superior: APROVADO

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1 =0;
        double nota2 =0;

        System.out.println("Insira o valor da primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Insira o valor da segunda nota: ");
        nota2 = scan.nextDouble();

        double media = (nota1 + nota2) /2;

        if(media <=4.9) {
            System.out.println("Aluno reprovado.");
        } else if (media <=6.9) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno aprovado.");
        }
    }
}
