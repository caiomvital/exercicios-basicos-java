//Crie um programa que leia vários números pelo teclado
//e mostre no final o somatório entre eles.
//Obs: O programa será interrompido quando o número 1111 for digitado

package exercicios05.enquantocomflag;

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero =0;
        int soma =0;
        int contador =0;

        while (numero !=1111) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero !=1111) {
                soma += numero;
                contador++;
                System.out.println("O total no momento está em " + soma);
                System.out.println("Digite o número 1111 para sair.");
            }

        }
        System.out.println("Você encerrou o programa após digitar " + contador + " números.");
        System.out.println("O somatório entre eles foi de " + soma + ".");

    }
}
