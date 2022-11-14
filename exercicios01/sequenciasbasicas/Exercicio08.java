//Desenvolva um programa que leia uma distância em metros
//e mostre os valores relativos em outras medidas.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distância em metros: ");
        double metros = scan.nextDouble();
        System.out.println("A distância em decímetros é "
                + (metros *10) + "dm.");
        System.out.println("A distância em centímetros é "
                + (metros *100) + "cm.");
        System.out.println("A distância em milímetros é "
                + (metros *1000) + "mm.");
        System.out.println("A distância em decâmetros é "
                + (metros /10) + "dam.");
        System.out.println("A distância em hectômetros é "
                + (metros /100) + "hm.");
        System.out.println("A distância em quilômnetros é "
                + (metros /1000) + "km.");

    }
}
