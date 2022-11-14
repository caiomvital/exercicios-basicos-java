//Crie um programa que leia o número de dias trabalhados
//em um mês e mostre o salário de um funcionário, sabendo
//que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Insira o número de dias trabalhados");
        int diasTrabalhados = scan.nextInt();
        double salario = (25*8) * diasTrabalhados;
        System.out.println(salario);
    }
}
