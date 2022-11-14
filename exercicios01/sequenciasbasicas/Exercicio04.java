//Desenvolva um algoritmo que leia dois números inteiros
//e mostre o somatório entre eles.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor1 = scan.nextInt();
        System.out.println("Digite outro valor: ");
        int valor2 = scan.nextInt();
        System.out.printf("A soma entre %d e %d é igual a %d.",valor1,valor2,(valor1+valor2));
    }
}
