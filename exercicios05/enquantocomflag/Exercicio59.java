//Crie um programa que leia o gênero e a idade de várias pessoas.
//O programa vai perguntar se o usuário quer continuar ou não a cada pessoa.
//No final, mostre:
//a) qual é a maior idade lida
//b) quantos homens foram cadastrados
//c) qual é a idade da mulher mais jovem
//d) qual é a média de idade entre os homens

package exercicios05.enquantocomflag;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        String genero;
        int idadeTotalHomens =0;
        int maiorIdade = Integer.MIN_VALUE;
        int homens =0;
        int mulherJovem = Integer.MAX_VALUE;
        int mediaHomens =0;
        String continuar = "S";

        do {
            if (continuar.equalsIgnoreCase("s")) {
                System.out.println("Entre com a idade: ");
                idade = scan.nextInt();
                if(idade > maiorIdade) {
                    maiorIdade = idade;
                }
                System.out.println("Entre com o gênero (M/F): ");
                genero = scan.next();
                if(genero.equalsIgnoreCase("M")) {
                    idadeTotalHomens += idade;
                    homens++;
                } else {
                    if (idade < mulherJovem) {
                        mulherJovem = idade;
                    }
                }
            }
            System.out.println("Deseja continuar? (S/N)");
            continuar = scan.next();

        } while (continuar.equalsIgnoreCase("s"));

        mediaHomens = idadeTotalHomens / homens;

        System.out.println("Você encerrou o programa.");
        System.out.println("A maior idade lida foi " + maiorIdade + " anos.");
        System.out.println("Foram cadastrados " + homens + " homens.");
        System.out.println("A mulher mais jovem inserida tem " + mulherJovem + " anos.");
        System.out.println("A idade média entre os homens inseridos é de " + mediaHomens);

    }
}
