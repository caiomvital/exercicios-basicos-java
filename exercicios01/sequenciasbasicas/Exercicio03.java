//Crie um programa que leia o nome e o salário de um funcionário,
// mostrando no final uma mensagem.


package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o nome do funcionario: ");
    String nome = scan.nextLine();
    System.out.println("Digite o salário do funcionário: ");
    Double salario = scan.nextDouble();

    System.out.printf("%nO funcionário %s tem um salário de " +
            "R$%f em Junho",nome,salario);

    }
}
