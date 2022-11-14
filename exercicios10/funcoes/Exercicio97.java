//Refaça o exercício 91, só que agora em forma de função Maior(),
//mas faça uma adaptação que vai receber TRÊS números como parâmetro
//e vai retornar qual foi o maior entre eles.


package exercicios10.funcoes;

import java.util.Scanner;

public class Exercicio97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int valorA = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valorB = scan.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int valorC = scan.nextInt();

        System.out.println("O maior número inserido foi: " +maior(valorA,valorB,valorC));
    }
    static int maior(int valorA,int valorB,int valorC) {
        int maiorValor = Integer.MIN_VALUE;
        if (valorA > valorB && valorA > valorC) {
            maiorValor = valorA;
        } else if (valorB > valorA && valorB > valorC) {
            maiorValor = valorB;
        } else if (valorC > valorA && valorC > valorB) {
            maiorValor = valorC;
        }

        return maiorValor;
    }

}
