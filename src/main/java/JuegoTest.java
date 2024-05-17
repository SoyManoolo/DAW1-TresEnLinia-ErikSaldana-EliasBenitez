import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @ParameterizedTest
    @CsvSource({"3", "4", "5", "6", "7", "8", "9", "10"})
    void novaPartida(int mida) { //metodo que comprueba que se crea un tablero de 3x3
        Juego j = new Juego();
        j.novaPartida(mida);
        assertEquals(mida, j.getTaulell().length );
    }

    @ParameterizedTest
    @CsvSource({"0,0,0,1", "1,1,1,2", "0,2,2,2", "2,1,2,0", "1,0,0,0"})
    void jugar(int fila1, int columna1, int fila2, int columna2) { //metodo que comprueba que se puede jugar en todas las casillas
        Juego j = new Juego();
        j.novaPartida(3);

        assertEquals('_',j.getCasillaTaulell(fila1, columna1)); // comprobar que la casilla esta vacia
        j.jugar(fila1, columna1);
        assertEquals('X',j.getCasillaTaulell(fila1, columna1)); // comprobar que la casilla esta ocupada;

        assertEquals('_',j.getCasillaTaulell(fila2, columna2)); // comprobar que la casilla esta vacia
        j.jugar(fila2, columna2);
        assertEquals('O',j.getCasillaTaulell(fila2, columna2)); // comprobar que la casilla esta ocupada;
    }


    @org.junit.jupiter.api.Test
    void jugadaGuanyadora() { //metodo que comprueba si hay jugada ganadora
        Juego j = new Juego();
        j.novaPartida(3);
        j.jugadaGuanyadora(1,2); //comprueba si hay jugada ganadora del jugador 1
        assertEquals(false, j.jugadaGuanyadora(1,2));

        j.jugar(1,1); //jugada jugador 1
        j.jugadaGuanyadora(1,2); //comprueba si hay jugada ganadora
        assertEquals(false, j.jugadaGuanyadora(1,2));

        j.turnoJugador1(); //le damos el turno al jugador 1
        j.jugar(1,0); //jugada jugador 1
        j.turnoJugador1(); //le damos el turno al jugador 1
        j.jugadaGuanyadora(1,2);
        assertEquals(true, j.jugadaGuanyadora(1,2));

        //iniciamos otra prueba para el jugador 2

        j.novaPartida(3); // crea un nuevo tablero para comprobar las jugadas del jugador 2
        j.turnoJugador2(); //le damos el turno al jugador 2
        j.jugadaGuanyadora(1,2); //comprueba si hay jugada ganadora del jugador 2
        assertEquals(false, j.jugadaGuanyadora(1,2));

        j.jugar(1,1); //jugada jugador 2
        j.jugadaGuanyadora(1,2); //comprueba si hay jugada ganadora del jugador 2
        assertEquals(false, j.jugadaGuanyadora(1,2));

        j.turnoJugador2(); //le volvemos a dar el turno al jugador 2
        j.jugar(1,0); //jugada jugador 2
        j.turnoJugador2(); //le volvemos a dar el turno al jugador 2
        j.jugadaGuanyadora(1,2); //comprueba si hay jugada ganadora del jugador 2
        assertEquals(true, j.jugadaGuanyadora(1,2));
    }
}