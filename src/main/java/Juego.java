public class Juego {
    private char [] [] taulell;
    private int torn;

    public char[][] getTaulell() {
        return taulell;
    }
    public char getCasillaTaulell(int fila, int columna) {
        return taulell[fila][columna];
    }

    public int getTorn() {
        return torn;
    }

    public void novaPartida() {
        /*
        taulell = new String [n][n];
         */
        taulell = new char[3][3]; // Crea el tablero de 3x3
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                taulell[i][j] = '_';
            }
        }
        torn = 1; //Inicia con el turno del jugador 1
    }

    public void jugar(int fila, int columna) {
        if (torn == 1) {
            taulell [fila] [columna] = 'X';
            ++torn;
        } else if (torn == 2) {
            taulell [fila] [columna] = 'O';
            --torn;
        }
    }

    public boolean jugadaGuanyadora(int fila, int columna) {
        boolean jugada = false;

        if (torn == 1){
            taulell[fila][columna] = 'X';

            for (int i = 0; i < taulell.length; i++) { //bucle que dice si hay alguna jugada ganadora en horizontal para el jugador 1
                if (taulell[i][0] == 'X' && taulell[i][1] == 'X' && taulell[i][2] == 'X') {
                    jugada = true;
                }
            }

            for (int i = 0; i < taulell.length; i++) { //bucle que dice si hay alguna jugada ganadora en vertical para el jugador 1
                if (taulell[0][i] == 'X' && taulell[1][i] == 'X' && taulell[2][i] == 'X') {
                    jugada = true;
                }
            }

            if (taulell[0][0] == 'X' && taulell[1][1] == 'X' && taulell[2][2] == 'X'){ //comprueba si hay jugada ganadora en las diagonales
                jugada = true;
            }
            else if (taulell[0][2] == 'X' && taulell[1][1] == 'X' && taulell[2][0] == 'X'){
                jugada = true;
            }

        } else if (torn == 2) {
            taulell[fila][columna] = 'O';

            for (int i = 0; i < taulell.length; i++) { //bucle que dice si hay alguna jugada ganadora en horizontal para el jugador 2
                if (taulell[i][0] == 'O' && taulell[i][1] == 'O' && taulell[i][2] == 'O') {
                    jugada = true;
                }
            }

            for (int i = 0; i < taulell.length; i++) { //bucle que dice si hay alguna jugada ganadora en vertical para el jugador 2
                if (taulell[0][i] == 'O' && taulell[1][i] == 'O' && taulell[2][i] == 'O') {
                    jugada = true;
                }
            }

            if (taulell[0][0] == 'O' && taulell[1][1] == 'O' && taulell[2][2] == 'O'){ //comprueba si hay jugada ganadora en las diagonales
                jugada = true;
            }
            else if (taulell[0][2] == 'O' && taulell[1][1] == 'O' && taulell[2][0] == 'O'){
                jugada = true;
            }
        }

        taulell[2][2] = '\u0000';

        return jugada;

        /* Codigo para tablero de 3 a 10
        for (int i = 0; i < taulell.length; i++) {
            if (taulell[2][i] == "X") jugada = true;
            else jugada = false;
        }
        if(jugada == true) return jugada;
        else 

        //vertical arriba
        for (int i = 0; i < taulell.length; i--) {
            if (taulell[2][i] == "X") jugada = true;
        }

        return jugada;
         */
    }

}
