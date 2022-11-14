//Crie um programa que leia o preço de um produto, calcule
//e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o preço do produto");
        double preco = scan.nextDouble();
        double promocao = preco - (preco *5) /100;
        System.out.println("O preço promocional é de R$ " + promocao);
    }
}
