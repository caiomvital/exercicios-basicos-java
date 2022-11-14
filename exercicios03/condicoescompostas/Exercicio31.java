//Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

package exercicios03.condicoescompostas;

import java.util.Random;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao;
        int valor = new Random().nextInt(3) + 1;

        System.out.println("Escolha uma das opções: ");
        System.out.println("\n1 - Pedra;" +
                "\n2 - Papel" +
                "\n3 - Tesoura");

        opcao = scan.nextInt();
        if (opcao == 1 && valor == 3) {
            System.out.println("Você escolheu Pedra.");
            System.out.println("O computador escolheu Tesoura.");
            System.out.println("Parabéns! Pedra vence Tesoura!");
        }
        if (opcao == 2 && valor == 1) {
            System.out.println("Você escolheu Papel.");
            System.out.println("O computador escolheu Pedra.");
            System.out.println("Parabéns! Papel vence Pedra!!");
        }
        if (opcao == 3 && valor == 2) {
            System.out.println("Você escolheu Tesoura.");
            System.out.println("O computador escolheu Papel.");
            System.out.println("Parabéns! Tesoura vence Papel!");
        }
        if (opcao == 1 && valor == 2) {
            System.out.println("Você escolheu Pedra.");
            System.out.println("O computador escolheu Papel.");
            System.out.println("Sinto muito! Papel vence Pedra.");
        }
        if (opcao == 2 && valor == 3) {
            System.out.println("Você escolheu Papel.");
            System.out.println("O computador escolheu Tesoura.");
            System.out.println("Sinto muito! Tesoura vence Papel.");
        }
        if (opcao == 3 && valor == 1) {
            System.out.println("Você escolheu Tesoura.");
            System.out.println("O computador escolheu Pedra.");
            System.out.println("Sinto muito! Pedra vence Tesoura.");
        }
    }
}
