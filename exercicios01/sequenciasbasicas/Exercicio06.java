//Faça um programa que leia um número inteiro
//e mostre o seu antecessor e seu sucessor.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        int antecessor = numero -1;
        int sucessor = numero +1;
        System.out.printf("O antecessor de %d é %d.%nO sucessor de %d é %d.",numero,antecessor,numero,sucessor);

    }
}
