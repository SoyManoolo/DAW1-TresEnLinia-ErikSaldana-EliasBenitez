import java.util.Scanner;
import java.util.Locale;

public class Juego {
    private String [] [] taulell;
    private int torn;

    public String[][] getTaulell() {
        return taulell;
    }

    public int getTorn() {
        return torn;
    }

    public String [] [] novaPartida() {
        System.out.println("Introduce el numero de filas y colmnas que deseas para el Tres en Raya");
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        this.taulell = new String[3][3];
        sc.close();
        return taulell;
    }

    public String [] [] jugar(String [] [] taulell) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Fila:");
        int fila = sc.nextInt();
        System.out.println("Columna");
        int columna = sc.nextInt();
         */
        System.out.println("Fila:");
        System.out.println("Columna");
        taulell [1] [2] = "X";
        return taulell;
    }

    public void jugadaGuanyadora() {

    }
}
