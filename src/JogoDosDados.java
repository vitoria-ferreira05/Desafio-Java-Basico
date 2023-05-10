import java.util.Scanner;
import java.util.Random;

public class JogoDosDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //definindo numero de rodadas
        int[] jogadas = new int[3];

        System.out.println("\n ---JOGO DOS DADOS--- \n VOCE TERA 3 TENTATIVAS :)");
        System.out.println("---------------------------------");

        for (int i = 0; i < jogadas.length; i++) {
            //solitando numero para o usuario
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            //gerando numero aleatorio
            int numeroAleatorio = random.nextInt(5) + 1;
            System.out.println("Numero aleatorio de 1 a 6: " + numeroAleatorio);

            //se numero digitado dor igual ao numero aleatorio = 10 pontos
            int comparacaoNumeros = 0;
            int comparacaNumeros = comparandoNumeroENumeroAleatorio(numero, numeroAleatorio, comparacaoNumeros);
        }

        //pontos do jogador: pedir para digitar os pontos das rodadas
        System.out.println("---PONTOS DAS RODADAS--- \n PARA VERIFICAR OS PONTOS QUE GANHOU, OLHE NO CONSOLE ;)");
        System.out.println("Agora digite os pontos que você ganhou em cada rodada: ");
        int totalPontos = 0;
        for (int i = 0; i < 3; i++) {
            int pontos = sc.nextInt();
            totalPontos += pontos;
        }
        System.out.println("O seu total de pontos nas rodadas foi de: " + totalPontos + " pontos");
    }

    public static int comparandoNumeroENumeroAleatorio(int numeroUsuario, int numeroAleatorio, int comparacaoNumeros) {
        if (numeroUsuario == numeroAleatorio) {
            System.out.println("Parabens, voce ganhou 10 pontos!!!");
            System.out.println("O numero que voce acertou foi o: " + numeroUsuario);
            System.out.println("---------------------------------");
        } else if (numeroUsuario >= 1 && numeroUsuario <= 6) {
            System.out.println("Parabens, voce ganhou 5 pontos!!!");
            System.out.println("O numero que voce acertou foi o: " + numeroUsuario);
            System.out.println("---------------------------------");
        } else {
            System.out.println("Ops, voce perdeu :(");
            System.out.println("O numero que voce errou foi o: " + numeroUsuario);
            System.out.println("---------------------------------");
        }
        return comparacaoNumeros;
    }
}


