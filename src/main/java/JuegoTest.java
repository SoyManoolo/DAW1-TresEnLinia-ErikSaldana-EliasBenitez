import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void novaPartida() {
        Juego j = new Juego();
        j.novaPartida();
        assertEquals(3, j.getTaulell().length );
    }

    @org.junit.jupiter.api.Test
    void jugar() {
        Juego j = new Juego();
        j.novaPartida();
        j.jugar(1,2);
        assertEquals('X', j.getCasillaTaulell(1,2));
    }

    @org.junit.jupiter.api.Test
    void jugadaGuanyadora() {
        Juego j = new Juego();
        j.novaPartida();
        assertEquals(false, j.jugadaGuanyadora(1,2));
    }
}