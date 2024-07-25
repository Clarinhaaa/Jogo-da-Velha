public class jogoDaVelha {
    private char matriz[][] = { { '-', '-', '-' },
            { '-', '-', '-' },
            { '-', '-', '-' } };
    private boolean ganhou = false;

    public void preencherMatriz(int i, int j, char letra) {
        this.matriz[i][j] = letra;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarLinha() {
        for (int i = 0; i < 3; i++) {
            if (this.matriz[i][0] != '-' && this.matriz[i][0] == this.matriz[i][1]
                    && this.matriz[i][0] == this.matriz[i][2]) {
                this.ganhou = true;
                break;
            }
        }

        return this.ganhou;
    }

    public boolean verificarColuna() {
        for (int i = 0; i < 3; i++) {
            if (this.matriz[0][i] != '-' && this.matriz[0][i] == this.matriz[1][i]
                    && this.matriz[0][i] == this.matriz[2][i]) {
                this.ganhou = true;
                break;
            }
        }

        return this.ganhou;
    }

    public boolean verificarDiagonal() {
        if (this.matriz[0][0] == '-' && this.matriz[0][0] == this.matriz[1][1]
                && this.matriz[0][0] == this.matriz[2][2]) {
            this.ganhou = true;
        } else if (this.matriz[0][2] == '-' && this.matriz[0][2] == this.matriz[1][1]
                && this.matriz[0][2] == this.matriz[2][0]) {
            this.ganhou = true;
        }

        return this.ganhou;
    }
}