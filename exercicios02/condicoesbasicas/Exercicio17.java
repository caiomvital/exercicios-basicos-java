//Escreva um programa que pergunte a velocidade de um carro.
//Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
//foi multado. Nesse caso, exiba o valor da multa, cobrando R$5
//por cada Km acima da velocidade permitida.

package exercicios02.condicoesbasicas;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int velocidade;
        double valorMulta =0;
        int calculoMulta =0;
        int n =80;
        System.out.println("Qual a velocidade do carro?");
        velocidade = scan.nextInt();

        if(velocidade > n) {
            System.out.println("O motorista foi multado.");
            calculoMulta = (velocidade -80) *5;
            System.out.printf("O valor da multa é de R$ %d",calculoMulta);
        } else {
            System.out.println("Velocidade permitida. Siga respeitando as leis de trânsito!");
        }
    }
}
