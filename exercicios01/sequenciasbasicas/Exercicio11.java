//Desenvolva uma lógica que leia os valores
//de A, B e C de uma equação do segundo grau
//e mostre o valor de Delta.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor de A");
        int a = scan.nextInt();
        System.out.println("Insira o valor de B");
        int b = scan.nextInt();
        System.out.println("Insira o valor de C");
        int c = scan.nextInt();
        System.out.println("A fórmula de Δ é b² - 4ac.");
        System.out.println("Δ = " + b + "² - 4 x " + a + " x " + c);
        System.out.println("Δ = "+ ((b*b) - (4* a * c)));

    }
}
