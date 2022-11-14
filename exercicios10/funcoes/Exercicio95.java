//Refaça o exercício 90, só que agora em forma de função Somador(),
//que vai receber dois parâmetros e vai retornar o resultado da soma
//entre eles para o programa principal.

package exercicios10.funcoes;

import java.util.Scanner;

public class Exercicio95 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valorA = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valorB = scan.nextInt();

        System.out.println("O valor da soma é " +somador(valorA,valorB));

    }
    static int somador(int valorA,int valorB) {
        return valorA + valorB;
    }
}

