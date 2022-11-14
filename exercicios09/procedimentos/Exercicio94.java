//Desenvolva um aplicativo que tenha um procedimento chamado Fibonacci()
//que recebe um único valor inteiro como parâmetro, indicando quantos
//termos da sequência serão mostrados na tela. O seu procedimento
//deve receber esse valor e mostrar a quantidade de elementos solicitados.
//Ex:
//Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
//Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM

package exercicios09.procedimentos;

import java.util.Scanner;

public class Exercicio94 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de termos que deseja ver: ");
        int qtdTermos = scan.nextInt();

        fibonacci(qtdTermos);
    }

    static void fibonacci(int qtdTermos) {

        int num1 = 1;
        int num2 = 0;

        for (int i = 0; i < qtdTermos; i++) {
            System.out.print(num1 + " ");
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
    }
}