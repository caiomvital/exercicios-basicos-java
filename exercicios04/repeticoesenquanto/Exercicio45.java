//O programa anterior vai ter um problema quando digitarmos
//o primeiro valor maior que o último. Resolva esse problema
//com um código que funcione em qualquer situação.

package exercicios04.repeticoesenquanto;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int aux;

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = scan.nextInt();
        System.out.println("Digite o incremento: ");
        int incremento = scan.nextInt();

        if (valor1 > valor2) {
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }

        while (valor1 < valor2) {
            System.out.print(valor1 + " ");
            valor1 += incremento;
        }
        System.out.print("Acabou!");
    }
}
