//Faça um programa que leia a idade e o gênero de 5 pessoas,
//mostrando no final:
//a) Quantos homens foram cadastrados
//b) Quantas mulheres foram cadastradas
//c) A média de idade do grupo
//d) A média de idade dos homens
//e) Quantas mulheres tem mais de 20 anos

package exercicios04.repeticoesenquanto;

import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade =0;
        int mediaIdade =0;
        int qtdHomens =0;
        int totalIdade =0;
        int totalIdadeHomens =0;
        int qtdMulheres =0;
        int mediaHomens =0;
        int qtdMulheres20 =0;
        int contador =0;
        String genero;

        while(contador <5) {
            System.out.println("Digite a idade da " + (contador +1) + " pessoa;");
            idade = scan.nextInt();
            System.out.println("Digite o gênero (M/F)");
            genero = scan.next();

            totalIdade += idade;

            if(genero.equalsIgnoreCase("M")) {
                qtdHomens++;
                totalIdadeHomens += idade;
            }
            if(genero.equalsIgnoreCase("F")) {
                qtdMulheres++;
                if(idade >20) {
                    qtdMulheres20++;
                }
            }
            contador++;
        }

        if (qtdHomens >0) {
            System.out.println("A quantidade de homens cadastrados foi " + qtdHomens);
            mediaHomens = totalIdadeHomens / qtdHomens;
            System.out.println("A média de idade dos homens é " + mediaHomens);
        }
        if (qtdMulheres >0) {
            System.out.println("A quantidade de mulheres cadastradas foi " + qtdMulheres);
            if(qtdMulheres20 >0) {
                System.out.println("A quantidade de mulheres acima de 20 anos foi " + qtdMulheres20);

            }
        }
        mediaIdade = totalIdade /5;
        System.out.println("A média de idade do grupo é " + mediaIdade);
    }
}
