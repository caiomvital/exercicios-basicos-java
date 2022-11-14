//Escreva um algoritmo que leia dois números inteiros
//e compare-os, mostrando na tela uma das mensagens abaixo:
//- O primeiro valor é o maior
//- O segundo valor é o maior
//- Não existe valor maior, os dois são iguais

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor1 =0;
        int valor2 =0;

        System.out.println("Insira o primeiro número: ");
        valor1 = scan.nextInt();
        System.out.println("Insira o segundo número: ");
        valor2 = scan.nextInt();
        if(valor2 > valor1) {
            System.out.printf("O segundo valor (%d) é maior que o primeiro valor (%d).",valor2,valor1);
        } else if (valor2 < valor1) {
            System.out.printf("O primeiro valor (%d) é maior que o segundo valor (%d).",valor1,valor2);
        } else {
            System.out.printf("O primeiro valor (%d) é igual ao segundo valor (%d).",valor1,valor2);
        }
    }
}
