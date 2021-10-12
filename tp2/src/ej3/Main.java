package ej3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tablero[][] = new int[10][10];

        double w = 0 , z = 0;
        int ntminas = 0 , intento = 30 , tminas = 10;
        boolean continuar = false;

        for (int j = 0; j < 10; j++)
            for (int i = 0; i < 10; i++)
                tablero[j][i] = 0;
        do {
            w = Math.random() * 10;
            z = Math.random() * 10;
            w = (int) w;
            z = (int) z;
            if (z != 0 && w != 0 && z != 10 - 1 && w != 10 - 1) {
                tablero[(int) w][(int) z] = 1;
                ntminas++;
            }
        } while (ntminas <= 5);

        System.out.println("\n-x----------------------------------------------------x-");
        System.out.println("  Ingresa las coordenas en el rango del 1 al 10 ");
        do {
            int x = 0, y = 0 , nminas = 0 , cor;
            do {
                do {
                    Scanner cordenada = new Scanner(System.in);
                    try {
                        System.out.println("\n-x----------------------------------------------------x-");
                        System.out.println("\n	Intento : " + intento + " , Cual es su coordenada? \n");
                        System.out.print("		Fila: ");
                        cor = cordenada.nextInt();
                        x = cor;
                        System.out.println();
                        System.out.print("		Columna: ");
                        cor = cordenada.nextInt();
                        y = cor;
                        continuar = true;
                    }
                    catch (InputMismatchException ex){
                        System.out.println("Ingrese un numero");
                    }
                }while(!continuar);
                if (x == 0 || y == 0 || x > 10 || y > 10)
                    System.out.println("\n	==>Coordenadas incorrectas<== \n");
            } while (x == 0 || y == 0 || x > 10 || y > 10);

            x = x - 1;
            y = y - 1;

            if (tablero[x][y] == 0) {
                if (x == 0 && y == 0) {
                    if (x + 1 >= 0 && x + 1 < 10 && y < 10)
                        nminas = nminas + tablero[x + 1][y];
                    if (x + 1 >= 0 && x + 1 < 10 && y + 1 < 10 && y + 1 >= 0)
                        nminas = nminas + tablero[x + 1][y + 1];
                    if (x >= 0 && x < 10 && y + 1 < 10 && y + 1 >= 0)
                        nminas = nminas + tablero[x][y + 1];
                } else {
                    if (y == 0) {
                        if (x + 1 >= 0 && x + 1 < 10 && y < 10)
                            nminas = nminas + tablero[x + 1][y];
                        if (x - 1 >= 0 && x - 1 < 10 && y < 10)
                            nminas = nminas + tablero[x - 1][y];
                        if (x - 1 >= 0 && x - 1 < 10 && y + 1 < 10 && y + 1 >= 0)
                            nminas = nminas + tablero[x - 1][y + 1];
                        if (x >= 0 && x < 10 && y + 1 < 10 && y + 1 >= 0)
                            nminas = nminas + tablero[x][y + 1];
                        if (x + 1 >= 0 && x + 1 < 10 && y + 1 < 10 && y + 1 >= 0)
                            nminas = nminas + tablero[x + 1][y + 1];
                    } else {
                        if (x - 1 >= 0 && x - 1 < 10 && y - 1 < 10)
                            nminas = nminas + tablero[x - 1][y - 1];
                        if (x >= 0 && x < 10 && y - 1 < 10)
                            nminas = nminas + tablero[x][y - 1];
                        if (x + 1 >= 0 && x + 1 < 10 && y - 1 < 10)
                            nminas = nminas + tablero[x + 1][y - 1];
                        if (x + 1 >= 0 && x + 1 < 10 && y < 10)
                            nminas = nminas + tablero[x + 1][y];
                        if (x - 1 >= 0 && x - 1 < 10 && y < 10)
                            nminas = nminas + tablero[x - 1][y];
                        if (x - 1 >= 0 && x - 1 < 10 && y + 1 < 10 && y + 1 >= 0)
                            nminas = nminas + tablero[x - 1][y + 1];
                        if (x >= 0 && x < 10 && y + 1 < 10 && y + 1 >= 0)
                            nminas = nminas + tablero[x][y + 1];
                        if (x + 1 >= 0 && x + 1 < 10 && y + 1 < 10 && y + 1 >= 0)
                            nminas = nminas + tablero[x + 1][y + 1];
                    }
                }
                System.out.print("\n	Mina no encontrada ");

                if (intento > tminas)
                    System.out.print("	Alrededor hay: " + nminas);
                System.out.println("\n	Intentos restantes: " + (intento - 1));
            } else {
                tminas = tminas - 1;
                System.out.println("\n	Acertaste!, Mina Eliminada quedan " + tminas + " Minas");
                System.out.println("\n	Intentos restantes: " + (intento - 1));
            }
            intento = intento - 1;
        } while (intento >= tminas && intento > 0 && tminas > 0);

        if (tminas == 0)
            System.out.println("		GANASTE!");

        if (tminas > intento)
            System.out.println("		PERDISTE!   (Exceso de minas restantes " + tminas + ")\n\n");

        if (intento == 0)
            System.out.println("		PERDISTE!");
    }
}



