//Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo
//com essas retas. Matematicamente, para três segmentos formarem
//um triângulo, o comprimento de cada lado deve ser menor que
//a soma dos outros dois. Adicione o recurso de mostrar que tipo
//de triângulo será formado:
//- EQUILÁTERO: todos os lados iguais
//- ISÓSCELES: dois lados iguais
//- ESCALENO: todos os lados diferentes

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lado1;
        int lado2;
        int lado3;
        boolean triangulo = false;

        System.out.println("Informe o valor do primeiro segmento de reta: ");
        lado1 = scan.nextInt();
        System.out.println("Informe o valor do segundo segmento de reta: ");
        lado2 = scan.nextInt();
        System.out.println("Informe o valor do terceiro segmento de reta: ");
        lado3 = scan.nextInt();

        if ((lado1 + lado2 >= lado3) || (lado2 + lado3 >= lado1) || (lado1 + lado3 >= lado2)) {
            System.out.println("É possível formar um triângulo com os três segmentos de reta inseridos.");
            triangulo = true;
        }
        if (triangulo) {
            if (lado1 == lado2 && lado3 == lado1) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 && lado1 != lado3) {
                System.out.println("O triângulo é isósceles.");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("O triângulo é escaleno.");
            }
        }
    }
}