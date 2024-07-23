public class jogoDaVelha {
    private char matriz[][] = {{' ', ' ', ' '},
                               {' ', ' ', ' '},
                               {' ', ' ', ' '}};
    private boolean ganhou = false;

    public void preencherMatriz(int i, int j, char letra) {
        matriz[i][j] = letra;
    }
    
    public void imprimirMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarLinha() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if (matriz[i][j] == matriz[i][j + 1] && matriz[i][j] == matriz[i][j + 2]) {
                    ganhou = true;
                }
            }
            if (ganhou) {
                break;
            }
        }

        return ganhou;
    }

    public boolean verificarColuna() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if (matriz[j][i] == matriz[j + 1][i] && matriz[j][i] == matriz[j + 2][i]) {
                    ganhou = true;
                }
            }
            if (ganhou) {
                break;
            }
        }

        return ganhou;
    }

    public boolean verificarDiagonal() {
        if (matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2]) {
            ganhou = true;
        } else if (matriz[2][2] == matriz[1][1] && matriz[2][2] == matriz[2][0]) {
            ganhou = true;
        }

        return ganhou;
    }

    public void verificarEmpate() {
        if (!verificarLinha() && !verificarColuna() && !verificarDiagonal()) {
            System.out.println("Empate!");
        }
    }
}