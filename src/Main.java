import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        jogoDaVelha jogo = new jogoDaVelha();
        int linha = 0;
        int coluna = 0;
        char matriz[][] = {{'-', '-', '-'},
                           {'-', '-', '-'},
                           {'-', '-', '-'}};

        System.out.println("Jogador 1: X\nJogador 2: O");
        jogo.imprimirMatriz(matriz);
        System.out.println();

        for (int i = 0; i < 9; i++) {
            System.out.print("Linha: ");
            linha = scan.nextInt();
            System.out.print("Coluna: ");
            coluna = scan.nextInt();

            if (i % 2 == 0) {
                matriz[linha][coluna] = 'X';
            } else {
                matriz[linha][coluna] = 'O';
            }

            jogo.imprimirMatriz(matriz);

            if (jogo.verificar(matriz, "linha") || jogo.verificar(matriz, "coluna") || jogo.verificar(matriz, "diagonal")) {
                System.out.println("O vencedor é " + matriz[linha][coluna] + "!");
                break;
            }
        }

        if ()

        scan.close();
    }
}