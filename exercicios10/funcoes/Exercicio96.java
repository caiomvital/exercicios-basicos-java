//Crie um programa que tenha uma função Media(),
//que vai receber as 2 notas de um aluno e retornar
//a sua média para o programa principal.

package exercicios10.funcoes;

import java.util.Scanner;

public class Exercicio96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("A média entre as notas é de " +media(nota1,nota2));
    }
    static double media(double nota1,double nota2) {

        return (nota1 + nota2) /2;
    }
}
