import java.util.Scanner;
import java.util.Locale;
//prueba de commit
public class TUI {

    public void mostrarMenu () {
        Scanner sc =new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Escribe el número de la acción que deseas hacer.");
        System.out.println("1. Nueva partida");
        System.out.println("2. Cargar partida");
        System.out.println("3. Configuración");
        System.out.println("4. Salir");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Has iniciado una nueva partida.");
                break;
            case 2:
                System.out.println("Has cargado la partida guardada.");
                break;
            case 3:
                System.out.println("Has abierto la configuración.");
                break;
            case 4:
                System.out.println("Has salido del tres en raya");
                break;
        }
    }
    public void mostrarTaulell() {
    }

    public void recollirJugada() {

    }
    public void fiDePartida() {
        
    }
}
