//Faça um algoritmo que leia a largura e altura de uma parede,
//calcule e mostre a área a ser pintada e a quantidade de tinta
//necessária para o serviço, sabendo que cada litro de tinta
//pinta uma área de 2 metros quadrados.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double altura =1;
        double largura =1;
        double litrosTinta;

        System.out.println("Digite a altura da parede: ");
        altura = scan.nextDouble();
        System.out.println("Digite a largura da parede: ");
        largura = scan.nextDouble();
        double areaTotal = altura * largura;
        litrosTinta = areaTotal *2;
        System.out.println("Serão necessários " + litrosTinta
                + " litros de tinta para pintar toda a parede.");

    }
}
