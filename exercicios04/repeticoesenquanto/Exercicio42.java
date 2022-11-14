//Faça um algoritmo que pergunte ao usuário um número inteiro
//e positivo qualquer e mostre uma contagem até esse valor:
//Ex: Digite um valor: 35
//Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

package exercicios04.repeticoesenquanto;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();
        int inicio =1;

        while (inicio <= valor) {
            System.out.print(inicio + " ");
            inicio++;
        }
        System.out.print("Acabou!");
    }
}
