//Numa promoção exclusiva para o Dia da Mulher, uma loja quer
//dar descontos para todos, mas especialmente para mulheres.
//Faça um programa que leia nome, gênero e o valor das compras do cliente
//e calcule o preço com desconto. Sabendo que:
//- Homens ganham 5% de desconto
//- Mulheres ganham 13% de desconto

package exercicios02.condicoesbasicas;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String genero = "";
        double valorCompra;
        int desconto;
        double valorDesconto =0;
        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.println("Digite seu gênero (M/F)");
        genero = scan.nextLine();
        System.out.println("Informe o valor total das compras: ");
        valorCompra = scan.nextDouble();

        System.out.printf("Olá, %s! ",nome);
        if(genero.equalsIgnoreCase("m")){
            desconto =5;
            valorDesconto = (valorCompra * desconto) /100;
            valorCompra -= valorDesconto;
            System.out.printf("O valor da compra teve um desconto de %f , e fica no total de %f",valorDesconto,valorCompra);
        }
        if(genero.equalsIgnoreCase("f")) {
            desconto =13;
            valorDesconto = (valorCompra * desconto) /100;
            valorCompra -= valorDesconto;
            System.out.printf("O valor da compra teve um desconto de %f, e fica no total de %f",valorDesconto,valorCompra);
        }
    }
}
