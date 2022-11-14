//Faça um algoritmo que pergunte a distância que um passageiro
//deseja percorrer em Km. Calcule o preço da passagem,
//cobrando R$0.50 por Km para viagens até 200Km
//e R$0.45 para viagens mais longas.

package exercicios02.condicoesbasicas;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double kmDesejado =0;
        double valor =0;

        System.out.println("Informe quantos quilômetros deseja percorrer: ");
        kmDesejado = scan.nextDouble();

        if(kmDesejado <200) {
            valor = kmDesejado *0.5;
        } else if (kmDesejado >=200) {
            valor = kmDesejado *0.45;
        }

        System.out.printf("O valor total a ser cobrado é de R$ %f.",valor);
    }
}
