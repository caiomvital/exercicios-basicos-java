//Faça um programa que leia o ano de nascimento de uma pessoa,
//calcule a idade dela e depois mostre se ela pode ou não votar.

package exercicios02.condicoesbasicas;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int anoAtual =2022;
        int anoNascimento =0;
        System.out.println("Informe o ano de nascimento: ");
        anoNascimento = scan.nextInt();

        if (anoAtual - anoNascimento >=16) {
            System.out.println("Pode votar.");
        } else {
            System.out.println("Ainda não pode votar.");
        }
    }
}
