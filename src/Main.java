import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        jogoDaVelha jogo = new jogoDaVelha();
        int linha = 0;
        int coluna = 0;
        String letra = "";

        System.out.println("Jogador 1: X\nJogador 2: O");
        jogo.imprimirMatriz();
        System.out.println();

        for (int i = 0; i < 9; i++) {
            System.out.print("Linha: ");
            linha = scan.nextInt();
            System.out.print("Coluna: ");
            coluna = scan.nextInt();

            System.out.println();

            if (i % 2 == 0) {
                letra = "X";
                jogo.preencherMatriz(linha, coluna, letra);
            } else {
                letra = "O";
                jogo.preencherMatriz(linha, coluna, letra);
            }

            jogo.imprimirMatriz();
            System.out.println();

            if (i >= 4) {
                if (jogo.verificarLinha() || jogo.verificarColuna() || jogo.verificarDiagonal()) {
                    System.out.println("Fim de jogo! O vencedor é: " + letra);
                    break;
                }
            }
        }

        jogo.verificarEmpate();

        scan.close();
    }
}