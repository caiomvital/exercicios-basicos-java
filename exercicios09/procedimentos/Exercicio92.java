//Crie uma lógica que leia um número inteiro
//e passe para um procedimento ParOuImpar()
//que vai verificar e mostrar na tela se
//o valor passado como parâmetro é PAR ou ÍMPAR.


package exercicios09.procedimentos;

import java.util.Scanner;

public class Exercicio92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Entre com um número: ");
        numero = scan.nextInt();

        parOuImpar(numero);
    }
    static void parOuImpar(int numero) {
        if(numero %2==0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
    }

