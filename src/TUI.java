import java.util.Scanner;
import java.util.Locale;
public class TUI {

    public static void opcionesMenu () {
        System.out.println("Escribe el número de la acción que deseas hacer.");
        System.out.println("1. Nueva partida");
        System.out.println("2. Cargar partida");
        System.out.println("3. Configuración");
        System.out.println("4. Salir");
    }

    public static void respuestaMenu() {

        Scanner sc =new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

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
}
