//Faça um aplicativo que leia o preço de 8 produtos.
//No final, mostre na tela qual foi o maior e qual foi
//o menor preço digitados.

package exercicios04.repeticoesenquanto;

import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] produtos = new double[8];
        int contador =0;
        double maiorPreco = Double.MIN_VALUE;
        double menorPreco = Double.MAX_VALUE;

        while (contador <8) {
            System.out.println("Insira o valor de um produto: ");
            produtos[contador] = scan.nextDouble();
            if(produtos[contador] > maiorPreco) {
                maiorPreco = produtos[contador];
            }
            if(produtos[contador] < menorPreco) {
                menorPreco = produtos[contador];
            }
            contador++;

        }
        System.out.println("O maior preço digitado foi: " + maiorPreco);
        System.out.println("O menor preço digitado foi: " + menorPreco);

    }
}
