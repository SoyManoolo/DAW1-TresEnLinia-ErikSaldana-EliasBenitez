import java.util.Scanner;

public class Juego {
    private String [][] enRaya = new String[3][3];

    public void enPartida (String [][] matriz) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Comienza la 'X'.");
        System.out.println("Introduce el espacio donde quieres hacer tu jugada.");
        boolean victoria = false;

        while (victoria == false) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (matriz[x][y] == "X" || matriz[x][y] == "O")
                System.out.println("Esta casilla ya ha sido rellenada. Elige otra casilla.");
            else {
                matriz[x][y] = sc.nextLine();
            }
        }
    }
}
