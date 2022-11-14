//Uma empresa de aluguel de carros precisa cobrar pelos seus
//serviços. O aluguel de um carro custa R$90 por dia para carro
//popular e R$150 por dia para carro de luxo. Além disso, o cliente
//paga por Km percorrido. Faça um programa que leia o tipo de carro alugado
//(popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos.
//No final mostre o preço a ser pago de acordo com a tabela a seguir:
//- Carros populares (aluguel de R$90 por dia)
//- Até 100Km percorridos: R$0,20 por Km
//- Acima de 100Km percorridos: R$0,10 por Km
//- Carros de luxo (aluguel de R$150 por dia)
//- Até 200Km percorridos: R$0,30 por Km
//- Acima de 200Km percorridos: R$0,25 por Km

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int diasAluguel;
        double kmPercorrido = 0;
        double valorTotal = 1;
        int opcao;

        System.out.println("O carro alugado foi popular ou de luxo? \n1 - Popular \n2 - Luxo");
        opcao = scan.nextInt();
        if (opcao == 1) {
            System.out.println("O aluguel foi por quantos dias?");
            diasAluguel = scan.nextInt();
            System.out.println("Quantos quilômetros foram percorridos?");
            kmPercorrido = scan.nextDouble();

            if (kmPercorrido <= 100) {
                valorTotal = (90 * diasAluguel) + (kmPercorrido * 0.2);
            } else if (kmPercorrido > 100) {
                valorTotal = (90 * diasAluguel) + (kmPercorrido * 0.1);
            }
            System.out.printf("O valor total a ser pago é R$ %f", valorTotal);

        } else if (opcao == 2) {
            System.out.println("O aluguel foi por quantos dias?");
            diasAluguel = scan.nextInt();
            System.out.println("Quantos quilômetros foram percorridos?");
            kmPercorrido = scan.nextDouble();

            if (kmPercorrido <= 200) {
                valorTotal = (150 * diasAluguel) + (kmPercorrido * 0.3);
            } else if (kmPercorrido > 200) {
                valorTotal = (150 * diasAluguel) + (kmPercorrido * 0.25);
            }
            System.out.printf("O valor total a ser pago é R$ %d", Math.round(valorTotal));
        }
    }
}
