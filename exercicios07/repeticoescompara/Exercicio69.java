//Desenvolva um programa que leia o primeiro termo e a razão
//de uma PA (Progressão Aritmética), mostrando na tela os 10
//primeiros elementos da PA e a soma entre todos os valores da sequência.

package exercicios07.repeticoescompara;

import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o termo da Progressão Aritmética");
        int termo = scan.nextInt();
        System.out.println("Entre com a razão da Progressão Aritmética");
        int razao = scan.nextInt();

        int soma =0;

        for (int i =0;i <10;i++) {
            System.out.println(termo + " + " + razao + " = " + (termo + razao));
            termo += razao;
            soma += termo;
        }
        System.out.println("A soma dos valores é " + soma);

    }
}
