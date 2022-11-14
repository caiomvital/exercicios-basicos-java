//Melhore o jogo feito no exercício 32. A partir de agora,
//o computador vai sortear um número entre 1 e 10
//e o jogador vai ter 4 tentativas para tentar acertar.

package exercicios04.repeticoesenquanto;

import java.util.Random;
import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int contador =1;
        int numeroSorteado = random.nextInt(10-1) +1;
        int numero;

        while(contador <=4) {
            System.out.println("Tente acertar o número: ");
            numero = scan.nextInt();
            if(numero == numeroSorteado) {
                System.out.println("Parabéns, você acertou! O número sorteado foi " + numeroSorteado);
                break;
            } else {
                System.out.println("Tente outra vez! Você ainda tem " + (4- contador) + " tentativas!");
            }

            contador++;
        }

    }
}
