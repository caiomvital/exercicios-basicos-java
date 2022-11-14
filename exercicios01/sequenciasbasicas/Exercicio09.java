//Faça um algoritmo que leia quanto dinheiro
//uma pessoa tem na carteira (em R$) e mostre quantos dólares
//ela pode comprar. Considere US$1,00 = R$3,45.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos R$ você tem na carteira?");
        double reais = scan.nextDouble();
        double dolares = reais /3.45;
        System.out.println("Você pode comprar US$" + dolares);

        scan.close();
    }
}
