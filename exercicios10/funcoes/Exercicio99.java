//Faça um programa que possua uma função chamada Potencia(),
//que vai receber dois parâmetros numéricos (base e expoente)
//e vai calcular o resultado da exponenciação.
//        Ex: Potencia(5,2) vai calcular 5² = 25

package exercicios10.funcoes;

import java.util.Scanner;

public class Exercicio99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor da base: ");
        int base = scan.nextInt();
        System.out.println("Entre com o valor do expoente: ");
        int expoente = scan.nextInt();

        System.out.printf("O valor da base (%d) elevado " +
                        "a %dª potência é igual a %d.",
                base,expoente,potencia(base,expoente));

    }
    static int potencia(int base,int expoente) {
        return (int) Math.pow(base,expoente);
    }
   }

