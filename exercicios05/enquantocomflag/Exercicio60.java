//Desenvolva um algoritmo que leia o nome, a idade e o gênero
//de várias pessoas. O programa vai perguntar se o usuário quer
//ou não continuar. No final, mostre:
//a) O nome da pessoa mais velha
//b) O nome da mulher mais jovem
//c) A média de idade do grupo
//d) Quantos homens tem mais de 30 anos
//e) Quantas mulheres tem menos de 18 anos

package exercicios05.enquantocomflag;

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "";
        String genero = "";
        String continuar = "S";
        String nomeMaisVelha = "";
        String nomeMaisJovem = "";
        int maisVelha = Integer.MIN_VALUE;
        int maisJovem = Integer.MAX_VALUE;
        int media =0;
        int totalPessoas =0;
        int totalIdade =0;
        int homensMais30 =0;
        int mulheresMenos18 =0;
        int idade =0;

        do {
            if(continuar.equalsIgnoreCase("S")) {
                System.out.println("Entre com o nome: ");
                nome = scan.next();
                System.out.println("Entre com a idade: ");
                idade = scan.nextInt();
                System.out.println("Entre com o gênero: ");
                genero = scan.next();
                totalIdade += idade;
                totalPessoas++;
                if (idade > maisVelha) {
                    maisVelha = idade;
                    nomeMaisVelha = nome;
                }
                if (idade < maisJovem && genero.equalsIgnoreCase("f")) {
                    maisJovem = idade;
                    nomeMaisJovem = nome;
                }
                if(idade >30&& genero.equalsIgnoreCase("m")) {
                    homensMais30++;
                }
                if(idade <18&& genero.equalsIgnoreCase("f")) {
                    mulheresMenos18++;
                }
                System.out.println("Deseja continuar? (S/N)");
                continuar = scan.next();
            }

        } while (continuar.equalsIgnoreCase("S"));

        media = totalIdade / totalPessoas;
        System.out.println("Você encerrou o programa.");
        System.out.println("O nome da pessoa mais velha é " + nomeMaisVelha);
        System.out.println("A mulher mais jovem se chama " + nomeMaisJovem);
        System.out.println("A média de idade do grupo é " + media);
        System.out.println("Foram registrados " + homensMais30 + " homens com mais de 30 anos.");
        System.out.println("Foram registradas " + mulheresMenos18 + " mulheres com menos de 18 anos.");

    }
}
