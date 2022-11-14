//Um programa de vida saudável quer dar pontos por atividades
//físicas que podem ser trocados por dinheiro. O sistema funciona assim:
//- Cada hora de atividade física no mês vale pontos
//- até 10h de atividade no mês: ganha 2 pontos por hora
//- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
//- acima de 20h de atividade no mês: ganha 10 pontos por hora
//- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
//Faça um programa que leia quantas horas de atividade uma pessoa
//teve por mês, calcule e mostre quantos pontos ela teve
//e quanto dinheiro ela conseguiu ganhar.

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horaMes =1;
        int pontos =1;
        double valorGanho =0;

        System.out.println("Informe quantas horas você fez atividades físicas esse mês: ");
        horaMes = scan.nextInt();

        if(horaMes <=10) {
            pontos = horaMes *2;
            valorGanho = (pontos *0.05);
            System.out.printf("Você marcou %d pontos. ",pontos);
        } else if (horaMes <20) {
            pontos = horaMes *5;
            valorGanho = (pontos *0.05);
            System.out.printf("Você marcou %d pontos. ",pontos);
        } else if (horaMes >20) {
            pontos = horaMes *10;
            valorGanho = (pontos *0.05);
            System.out.printf("Você marcou %d pontos. ",pontos);
        }

        System.out.printf("Você ganhou R$ %f!",valorGanho);
    }
}
