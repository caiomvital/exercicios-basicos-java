//Escreva um programa para aprovar ou não o empréstimo bancário
//para a compra de uma casa. O programa vai perguntar o valor da casa,
//o salário do comprador e em quantos anos ele vai pagar.
//Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30%
//do salário ou então o empréstimo será negado.

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorEmprestimo;
        double valorCasa;// variável não utilizada dentro do que foi pedido na questão
        double salario;
        double valorParcela;
        int anos;

        System.out.println("Informe o valor do empréstimo desejado: ");
        valorEmprestimo = scan.nextDouble();
        System.out.println("Informe o valor da casa: ");
        valorCasa = scan.nextDouble();
        System.out.println("Informe o valor do seu salário: ");
        salario = scan.nextDouble();
        System.out.println("Em quantos anos deseja quitar o empréstimo?");
        anos = scan.nextInt();

        valorParcela = valorEmprestimo / (anos * 12);

        if (valorParcela > ((salario * 30) / 100)) {
            System.out.printf("O valor da parcela ficou em R$ %d", Math.round(valorParcela));
            System.out.println("Sinto muito, o valor da parcela ultrapassa 30% do seu salário, o empréstimo foi negado.");
        } else {
            System.out.printf("O valor da parcela ficou em R$ %d", Math.round(valorParcela));
            System.out.println("Parabéns, o empréstimo foi concedido!");
        }
    }
}
