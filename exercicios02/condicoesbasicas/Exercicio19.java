//Crie um algoritmo que leia o nome e as duas notas de um aluno,
//calcule a sua média e mostre na tela. No final, analise a média
//e mostre se o aluno teve ou não um bom aproveitamento
//(se ficou acima da média 7.0).

package exercicios02.condicoesbasicas;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1 =0;
        double nota2 =0;
        double media = (nota1+nota2) /2;

        System.out.println("Informe a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = scan.nextDouble();
        if(media >=7) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }
}
