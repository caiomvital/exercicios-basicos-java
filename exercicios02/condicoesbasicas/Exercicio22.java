//Escreva um programa que leia o ano de nascimento de um rapaz
//e mostre a sua situação em relação ao alistamento militar.
//- Se estiver antes dos 18 anos, mostre quantos anos
//faltam para o alistamento.
//- Se já tiver depois dos 18 anos, mostre quantos anos
//já se passaram do alistamento.

package exercicios02.condicoesbasicas;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade =0;
        System.out.println("Informe a idade: ");
        idade = scan.nextInt();
        if(idade <18) {
            System.out.printf("Faltam %d ano(s) para o alistamento.",(18- idade));
        } else {
            System.out.printf("O alistamento foi há %d ano(s).",(idade -18));
        }
    }
}
