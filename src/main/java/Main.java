import java.util.Scanner;
import java.util.Locale;
import java.io.File;

public class Main {
    
    TUI t;
    Juego j = new Juego();

    public void setMidaTaulell(int mida) {
        j.setTaulell(new char[mida][mida]);
    }

    public Main() {
        this.t = new TUI(this);
    }
    
    public void novaPartida() {
        File file = new File("config.txt");
        try {
            Scanner reader = new Scanner(file);
            reader.useLocale(Locale.ENGLISH);
            int mida = reader.nextInt();
            j.novaPartida(mida);
            t.mostrarTaulell(j.getTaulell());
        } catch (Exception e) {
            System.out.println("Error al leer el archivo de configuración");
        }
    }

    public void carregarPartida() {
        
    }

    public void configuracio() {
        t.mostrarConfiguracio(j.getLenghtTaulell());
    }

    public void sortir() {
        
    }


    public static void main(String[] args) {
        Main m = new Main();
        m.t.mostrarMenu();

    }
}