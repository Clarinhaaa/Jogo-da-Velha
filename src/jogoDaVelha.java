public class jogoDaVelha {
    public void imprimirMatriz(char matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificar(char matriz[][], String palavra) {
        boolean ganhou = false;

        switch(palavra) {
            case "linha":
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
            break;

            case "coluna":
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 1; j++) {
                    if (matriz[j][i] == matriz[j][i + 1] && matriz[j][i] == matriz[j][i + 2]) {
                        ganhou = true;
                    }
                }
                if (ganhou) {
                    break;
                }
            }
            break;

            case "diagonal":
            if (matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2]) {
                ganhou = true;
            } else if (matriz[2][2] == matriz[1][1] && matriz[2][2] == matriz[2][0]) {
                ganhou = true;
            }
            break;
        }

        return ganhou;
    }
}