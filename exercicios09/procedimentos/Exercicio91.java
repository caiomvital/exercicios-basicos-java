//Desenvolva um algoritmo que leia dois valores pelo teclado
//e passe esses valores para um procedimento Maior() que vai verificar
//qual deles é o maior e mostrá-lo na tela. Caso os dois valores
//sejam iguais, mostrar uma mensagem informando essa característica.

package exercicios09.procedimentos;

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valorA;
        int valorB;

        System.out.println("Digite o primeiro valor");
        valorA = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        valorB = scan.nextInt();

        maior(valorA,valorB);
    }
    static void maior(int valorA,int valorB) {
        if(valorA > valorB) {
            System.out.println(valorA + " é maior que " + valorB);
        } else if (valorB > valorA) {
            System.out.println(valorB + " é maior que " + valorA);
        } else {
            System.out.println("Os valores " + valorA + " e " + valorB + " são iguais.");
        }
    }

    }

