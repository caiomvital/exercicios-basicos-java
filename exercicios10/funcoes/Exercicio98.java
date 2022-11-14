//Crie um programa que tenha uma função SuperSomador(),
//que vai receber dois números como parâmetro e depois
//vai retornar a soma de todos os valores no intervalo
//entre os valores recebidos.
//Ex:
//SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
//SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85

package exercicios10.funcoes;

import java.util.Scanner;

public class Exercicio98 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor: ");
        int valorA = scan.nextInt();
        System.out.println("Entre com o segundo valor: ");
        int valorB = scan.nextInt();
        System.out.println("A soma dos valores dentro do intervalo (" + valorA +
                ", " + valorB + ") resultou em " +superSomador(valorA,valorB));
    }
    static int superSomador(int valorA,int valorB) {
        int total =0;
        for (int i = valorA;i <= valorB;i++) {
            total += i;
        }

        return total;
    }
}

