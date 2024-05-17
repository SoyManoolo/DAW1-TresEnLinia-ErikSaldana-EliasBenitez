import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.io.File;
import java.io.FileWriter;

public class TUI {

    Main m;

    public TUI(Main m) {
        this.m = m;
    }

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
                m.novaPartida();
                break;
            case 2:
                System.out.println("Has cargado la partida guardada.");
                m.carregarPartida();
                break;
            case 3:
                System.out.println("Has abierto la configuración.");
                m.configuracio();
                break;
            case 4:
                System.out.println("Has salido del tres en raya");
                break;
        }
    }

    public void mostrarConfiguracio(int mida) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Mida del taulell: " + mida + "x" + mida);
        System.out.println("1. Canviar mida del taulell");
        System.out.println("2. Tornar al menú principal");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Escriu la nueva mida del taulell");
                int nova_mida = sc.nextInt();
                while (nova_mida < 3 || nova_mida > 10) {
                    System.out.println("La mida mínima del taulell es 3x3 y la mida máxima es 10x10. Torna a introduir la nova mida.");
                    nova_mida = sc.nextInt();
                }
                    File file = new File("config.txt");
                    try {
                        file.createNewFile();
                        FileWriter writer = new FileWriter("config.txt");
                        writer.write(Integer.toString(nova_mida));
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred: " + e.getMessage());
                    }

                m.setMidaTaulell(nova_mida);
                break;
            case 2:
                break;
        }

        mostrarMenu();
    }

    public void mostrarTaulell(char [][] taulell) {
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell.length; j++) {
                System.out.print(taulell[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void recollirJugada() {

    }
    public void fiDePartida() {
        
    }
}
