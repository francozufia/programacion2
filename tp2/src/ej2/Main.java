package ej2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int stockInput = 0;
        boolean continuar = false;
        Scanner input = new Scanner(System.in);
        ArrayList<Productos> listaProductos = new ArrayList<Productos>();
        do {
            System.out.print("1: Registrar productos   2: Ver Productos  3: Salir  opcion--> ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                     Productos producto = new Productos();
                    input.nextLine();
                    System.out.print("Nombre producto : ");
                     producto.setNombre(input.nextLine());
                    System.out.print("Codigo : ");
                     producto.setCodigo(input.nextLine());
                    do {
                        Scanner inputBucle2 = new Scanner(System.in);
                        System.out.print("Stock : ");
                        try {
                            stockInput = inputBucle2.nextInt();
                            producto.setStock(stockInput);
                            listaProductos.add(producto);
                            continuar = true;
                        } catch (InputMismatchException ignored) {
                            System.out.println("Debe ingresar un numero");
                        }
                    }while(!continuar);
                    break;
                case 2:
                    for (Productos p : listaProductos) {
                        if (p.getStock() < 10) {
                            System.out.println("Nombre: " + p.getNombre() + "  Codigo: " + p.getCodigo() + "  Stock: " + p.getStock());
                            System.out.println("_______________________________________");
                        }
                    }
                    break;
            }
        }while(opcion != 3 );
    }
}