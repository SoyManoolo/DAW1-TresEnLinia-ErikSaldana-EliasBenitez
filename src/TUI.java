import java.util.Scanner;
import java.util.Locale;
public class TUI {

    public static void opcionesMenu() {

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
