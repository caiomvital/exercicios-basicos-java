//Crie um programa que melhore o procedimento Gerador()
//da questão anterior para que mostre uma mensagem várias vezes
//Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
//+-------=======------+
//Aprendendo Portugol
//Aprendendo Portugol
//Aprendendo Portugol
//Aprendendo Portugol
//+-------=======------+

package exercicios09.procedimentos;

import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase;
        int contador =0;
        System.out.println("Digite uma frase: ");
        frase = scan.nextLine();
        System.out.println("Entre com o contador: ");
        contador = scan.nextInt();
        gerador(frase,contador);
    }
    static void gerador(String intro,int contador) {
        System.out.println("+-------=======------+");
        for (int i =0;i < contador;i++) {
            System.out.println(intro);
        }
        System.out.println("+-------=======------+");
    }
}
