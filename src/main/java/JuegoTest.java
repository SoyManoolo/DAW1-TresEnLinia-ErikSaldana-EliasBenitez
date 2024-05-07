import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class JuegoTest {

    @org.junit.jupiter.api.Test
    void novaPartida() {
        Juego j = new Juego();
        String [] [] matriu = j.novaPartida();
        assertEquals(3, matriu.length );
    }

    @org.junit.jupiter.api.Test
    void jugar() {
        String [][] taulell = new String[3][3];
        Juego j = new Juego();
        String [] [] valor = j.jugar(taulell);
        assertEquals("X", valor [1] [2]);
    }

    @org.junit.jupiter.api.Test
    void jugadaGuanyadora() {
    }
}