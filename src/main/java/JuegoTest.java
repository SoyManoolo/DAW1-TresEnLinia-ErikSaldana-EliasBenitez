import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void novaPartida() { //metodo que comprueba que se crea un tablero de 3x3
        Juego j = new Juego();
        j.novaPartida();
        assertEquals(3, j.getTaulell().length );
    }

    @ParameterizedTest
    @CsvSource({"0,0,0,1", "1,1,1,2", "0,2,2,2", "2,1,2,0", "1,0,0,0"})
    void jugar(int fila1, int columna1, int fila2, int columna2) { //metodo que comprueba que se puede jugar en todas las casillas
        Juego j = new Juego();
        j.novaPartida();

        assertEquals('_',j.getCasillaTaulell(fila1, columna1)); // comprobar que la casilla esta vacia
        j.jugar(fila1, columna1);
        assertEquals('X',j.getCasillaTaulell(fila1, columna1)); // comprobar que la casilla esta ocupada;

        assertEquals('_',j.getCasillaTaulell(fila2, columna2)); // comprobar que la casilla esta vacia
        j.jugar(fila2, columna2);
        assertEquals('O',j.getCasillaTaulell(fila2, columna2)); // comprobar que la casilla esta ocupada;
        assertThrows(IllegalArgumentException.class, () -> j.jugar(fila2, columna2)); // comprobar que la casilla no se puede ocupar dos veces
    }


    @org.junit.jupiter.api.Test
    void jugadaGuanyadora() { //metodo que comprueba que no hay jugada ganadora
        Juego j = new Juego();
        j.novaPartida();
        assertEquals(false, j.jugadaGuanyadora(1,2));
    }
}