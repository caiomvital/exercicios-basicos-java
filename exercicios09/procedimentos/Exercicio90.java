//Desenvolva um algoritmo que leia dois valores pelo teclado
//e passe esses valores para um procedimento Somador()
//que vai calcular e mostrar a soma entre eles.



package exercicios09.procedimentos;

import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valorA =0;
        int valorB =0;

        System.out.println("Digite o primeiro valor: ");
        valorA = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        valorB = scan.nextInt();

        soma(valorA,valorB);

    }
    static void soma(int valorA,int valorB) {
        System.out.println("A soma resultou em " + (valorA + valorB));
    }
    }

