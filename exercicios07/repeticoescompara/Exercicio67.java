//Faça um programa usando a estrutura “para” que leia um número
//inteiro positivo e mostre na tela uma contagem de 0 até o valor digitado:
//Ex: Digite um valor: 9
//        Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!

package exercicios07.repeticoescompara;

import java.util.Scanner;

public class Exercicio67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Entre com um número: ");
        numero = scan.nextInt();

        for (int i =0;i <= numero;i++){
            System.out.print(i + " ");
        }

        System.out.println("FIM!");
    }
}
