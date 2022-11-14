//Faça um programa que leia as duas notas de um aluno
//em uma matéria e mostre na tela a sua média na disciplina.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.printf("A média entre %f e %f é igual a %f",nota1,nota2,((nota1+nota2)/2));
    }
}
