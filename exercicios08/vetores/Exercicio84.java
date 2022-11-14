//Crie um programa que leia o nome e a idade de 9 pessoas e guarde
//esses valores em dois vetores, em posições relacionadas. No final,
//mostre uma listagem contendo apenas os dados das pessoas menores de idade.


package exercicios08.vetores;

import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[9];
        int[] idades = new int[9];
        int contador =0;


        for (int i =0;i < nomes.length;i++) {
            System.out.println("Digite o nome da " + (i+1) + "ª pessoa.");
            nomes[i] = scan.next();
            System.out.println("Digite a idade da " + (i+1) + "ª pessoa.");
            idades[i] = scan.nextInt();
        }
        System.out.println("Lista das pessoas menores de idade: ");
        for (int i =0;i < nomes.length;i++) {
            if(idades[i] <18) {

                System.out.println("O nome da " + (contador+1) + "ª pessoa é " + nomes[i]);
                System.out.println("A idade da "  + (contador+1) + "ª pessoa é " + idades[i]);
                contador++;
            }
        }

    }
}
