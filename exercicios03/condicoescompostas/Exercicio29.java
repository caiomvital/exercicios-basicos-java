//Desenvolva um programa que leia o nome de um funcionário,
//seu salário, quantos anos ele trabalha na empresa e mostre
//seu novo salário, reajustado de acordo com a tabela a seguir:
//- Até 3 anos de empresa: aumento de 3%
//- entre 3 e 10 anos: aumento de 12.5%
//- 10 anos ou mais: aumento de 20%

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        double salario;
        int qtdAnos;
        double reajuste =0;

        System.out.println("Informe o nome do funcionário: ");
        nome = scan.nextLine();
        System.out.println("Informe seu salário: ");
        salario = scan.nextDouble();
        System.out.println("Informe quantos anos trabalha na empresa: ");
        qtdAnos = scan.nextInt();

        if(qtdAnos <3) {
            reajuste = (salario *3)/100;

        } else if (qtdAnos >3&& qtdAnos <10) {
            reajuste = (salario *12.5)/100;

        } else if (qtdAnos >10) {
            reajuste = (salario *20)/100;
        }

        salario += reajuste;
        System.out.printf("Olá, %s! Pelos %d anos trabalhados na empresa, seu novo salário será de %f.",
                nome,qtdAnos,salario);
    }
}
