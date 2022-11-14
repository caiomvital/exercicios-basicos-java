//Faça um programa que tenha um procedimento chamado Contador()
//que recebe três valores como parâmetro: o início, o fim
//e o incremento de uma contagem. O programa principal deve solicitar
//a digitação desses valores e passá-los ao procedimento, que vai mostrar
//a contagem na tela.
//
//Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
//Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM

package exercicios09.procedimentos;

import java.util.Scanner;

public class Exercicio93 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor de início: ");
        int inicio = scan.nextInt();
        System.out.println("Entre com o valor final: ");
        int fim = scan.nextInt();
        System.out.println("Entre com o incremento: ");
        int contador = scan.nextInt();

        contador(inicio,fim,contador);
    }
    static void contador(int inicio,int fim,int contador) {
        System.out.println("O contador começará em " + inicio);
        System.out.println("Terminará em " + fim);
        System.out.println("Será incrementado em " + contador + " a cada iteração.");
        for (int i = inicio;i < fim;i += contador) {
            System.out.println(i);
        }
        System.out.println("Fim");
    }
}
