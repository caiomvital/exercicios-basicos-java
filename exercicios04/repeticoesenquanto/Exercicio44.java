//Crie um algoritmo que leia o valor inicial da contagem,
//o valor final e o incremento, mostrando em seguida todos
//os valores no intervalo:

package exercicios04.repeticoesenquanto;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = scan.nextInt();
        System.out.println("Digite o incremento: ");
        int incremento = scan.nextInt();

        while (valor1 < valor2) {
            System.out.print(valor1 + " ");
            valor1 += incremento;
        }
        System.out.print("Acabou!");
    }
}
