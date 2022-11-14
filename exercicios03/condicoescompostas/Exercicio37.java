//Uma empresa precisa reajustar o salário dos seus funcionários,
//dando um aumento de acordo com alguns fatores. Faça um programa
//que leia o salário atual, o gênero do funcionário e há quantos anos
//esse funcionário trabalha na empresa. No final, mostre o seu novo salário,
//baseado na tabela a seguir:
//- Mulheres
//- menos de 15 anos de empresa: +5%
//- de 15 até 20 anos de empresa: +12%
//- mais de 20 anos de empresa: +23%
//- Homens
//- menos de 20 anos de empresa: +3%
//- de 20 até 30 anos de empresa: +13%
//- mais de 30 anos de empresa: +25%

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioAtual =0;
        String genero;
        int anosNaEmpresa;
        double novoSalario =0;

        System.out.println("Informe o salário atual do funcionário: ");
        salarioAtual = scan.nextDouble();
        System.out.println("Informe o gênero do funcionário(M/F): ");
        genero = scan.next();
        System.out.println("Por fim, informe há quantos anos o funcionário está na empresa: ");
        anosNaEmpresa = scan.nextInt();

        if (genero.equalsIgnoreCase("m")) {
            if(anosNaEmpresa <=20) {
                novoSalario = salarioAtual + ((salarioAtual *3) /100);
                System.out.printf("O novo salário será de %f",novoSalario);
            } else if (anosNaEmpresa <=30) {
                novoSalario += salarioAtual + ((salarioAtual *13) /100);
                System.out.printf("O novo salário será de %f",novoSalario);
            } else {
                novoSalario += salarioAtual + ((salarioAtual *25) /100);
                System.out.printf("O novo salário será de %f",novoSalario);
            }
        } else if (genero.equalsIgnoreCase("f")) {
            if(anosNaEmpresa <=15) {
                novoSalario += salarioAtual + ((salarioAtual *5) /100);
                System.out.printf("O novo salário será de %f",novoSalario);
            } else if (anosNaEmpresa <=20) {
                novoSalario += salarioAtual + ((salarioAtual *12) /100);
                System.out.printf("O novo salário será de %f",novoSalario);
            } else {
                novoSalario += salarioAtual + ((salarioAtual *23) /100);
                System.out.printf("O novo salário será de %f",novoSalario);
            }
        }
    }
}
