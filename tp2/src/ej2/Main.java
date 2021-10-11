package ej2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion , continuar = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Productos> listaProductos = new ArrayList<Productos>();
        System.out.print("1: Registrar productos   2: Ver Productos  3: Salir opcion: ");
        opcion = input.nextInt();
        do {
            switch (opcion) {
                case 1:
                    Productos producto = new Productos();
                    input.nextLine();
                    System.out.print("Nombre producto : ");
                    producto.setNombre(input.nextLine());
                    System.out.print("Codigo : ");
                    producto.setCodigo(input.nextLine());
                    do{
                        try {
                            System.out.print("Stock : ");
                            producto.setStock(input.nextInt());
                            listaProductos.add(producto);
                            continuar = 2;
                            break;
                        } catch (InputMismatchException ex) {
                            System.out.println("Debe ingresar un numero");
                            continuar = 2;
                        }
                    }while(continuar != 2);
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
        }while(opcion != 3);
    }
}
