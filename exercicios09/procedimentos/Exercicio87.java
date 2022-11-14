//Crie um programa que melhore o procedimento Gerador()
//da questão anterior para mostrar uma mensagem personalizada,
//passada como parâmetro.
//Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
//+-------=======------+
//Aprendendo Portugol
//+-------=======------+
package exercicios09.procedimentos;

import java.util.Scanner;

public class Exercicio87 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase;
        System.out.println("Digite uma frase: ");
        frase = scan.nextLine();
        gerador(frase);
    }
    static void gerador(String intro) {
        System.out.println("+-------=======------+");
        System.out.println(intro);
        System.out.println("+-------=======------+");
    }
}
