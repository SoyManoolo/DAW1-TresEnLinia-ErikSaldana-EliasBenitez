import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void novaPartida() {
        Juego j = new Juego();
        j.novaPartida();
        assertEquals(3, j.getTaulell().length );
    }

    @ParameterizedTest
    @CsvSource({"0,0" , "0,1"})
    void jugar(int n1, int n2) {
        Juego j = new Juego();
        j.novaPartida();

        assertEquals('_',j.getCasillaTaulell(n1,n2)); // comprobar que la casilla esta vacia
        j.jugar(n1,n2);
        assertEquals('X',j.getCasillaTaulell(n1,n2));
    }


    @org.junit.jupiter.api.Test
    void jugadaGuanyadora() {
        Juego j = new Juego();
        j.novaPartida();
        assertEquals(false, j.jugadaGuanyadora(1,2));
    }
}