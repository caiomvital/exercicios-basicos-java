//A locadora de carros precisa da sua ajuda para cobrar
//seus serviços. Escreva um programa que pergunte a quantidade
//de Km percorridos por um carro alugado e a quantidade de dias
//pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double kmRodados =0;
        int diasAluguel =0;
        double aluguel =90;
        double valorPorKm =0.20;

        System.out.println("Insira a quantidade de dias pelos quais o carro foi alugado");
        diasAluguel = scan.nextInt();
        System.out.println("Insira a quantidade de km percorridos");
        kmRodados = scan.nextDouble();
        System.out.print("O valor total a ser cobrado é R$");
        System.out.print((diasAluguel * aluguel) + (kmRodados * valorPorKm));
        System.out.println("\nSendo " + (diasAluguel * aluguel) + " o total pelos dias em que o carro foi alugado e " +
                (kmRodados * valorPorKm) + " o valor a ser cobrado pelos quilômetros percorridos.");

    }
}
