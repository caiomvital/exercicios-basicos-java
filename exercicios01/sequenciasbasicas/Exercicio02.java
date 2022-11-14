//Faça um programa que leia o nome de uma pessoa
// e mostre uma mensagem de boas-vindas para ela:

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scan.nextLine();
        System.out.printf("%n Olá, %s, é um prazer te conhecer!",nome);

    }
}
