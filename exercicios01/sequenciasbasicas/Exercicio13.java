//Faça um algoritmo que leia o salário de um funcionário,
//calcule e mostre o seu novo salário, com 15% de aumento.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário do funcionario");
        double salario = scan.nextDouble();
        double aumento = (salario *15) /100;
        double salarioNovo = salario + aumento;
        System.out.println("O novo salario sera de R$" + salarioNovo);
    }
}
