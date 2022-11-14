//Faça um programa que leia 7 nomes de pessoas e guarde-os
//em um vetor. No final, mostre uma listagem com todos
//os nomes informados, na ordem inversa daquela em que eles foram informados.

package exercicios08.vetores;

import java.util.Scanner;

public class Exercicio77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vetor = new String[7];

        for (int i =0;i < vetor.length;i++) {

            System.out.println("Digite o " + (i+1) + "º nome: ");
            vetor[i] = scan.next();

        }
        System.out.println();

        for (int i =6;i >=0;i--) {
            System.out.println(vetor[i]);

        }
    }
}
