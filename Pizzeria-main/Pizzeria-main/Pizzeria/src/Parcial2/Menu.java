package Parcial2;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

    public static void Pedidos() {
        ArrayList <Pedido> pedidos = new ArrayList<>();
        int opcion, pedido=1;

        String op;
        boolean repite = true;

        do {
            op= JOptionPane.showInputDialog("       BIENVENIDO    \n"
                + "1. Cargar Pedido\n"
                + "2. Borrar Pedido\n"
                + "3. Listar Pedidos.\n"
                + "4. Estadisticas \n"
                + "5. Finalizar\n ");
            opcion=Integer.parseInt(op);

            switch (opcion) {
                case 1:
                    MenuPedido.menu(pedidos, pedido);
                    pedido += 1;
                    break;

                case 2:
                    MenuPedido.desencolar(pedidos);
                    break;

                case 3:
                    if (MenuPedido.colaVacia(pedidos)){
                        JOptionPane.showMessageDialog(null, "\nNo hay pedidos.\n");
                    } else{
                        for(Pedido p : pedidos){
                            p.MostrarDatos();
                        }
                    }
                   break;

                case 4:
                    int [] cantidadPedidos={0,0,0,0};
                    double recaudacionDia;
                    for(Pedido p : pedidos){
                       if(p.getTipoPromo() == 1){
                           cantidadPedidos[0] += p.getCantidad();
                       }
                       if(p.getTipoPromo() == 2){
                           cantidadPedidos[1] += p.getCantidad();
                       }
                       if(p.getTipoPromo() == 3){
                           cantidadPedidos[2] += p.getCantidad();
                       }
                       if(p.getTipoPromo() == 4){
                           cantidadPedidos[3] += p.getCantidad();
                       }
                   }
                    recaudacionDia = (cantidadPedidos[0] * 500 ) + (cantidadPedidos[1] * 800) + (cantidadPedidos[2] * 600) + (cantidadPedidos[3] * 400);
                    JOptionPane.showMessageDialog(null,"Cantidad de pedidos en el dia : " + (pedido-1) +"\n"
                        + "Recaudado a lo largo del dia : $ " + recaudacionDia);
                    mostrarArrayRecursivo(cantidadPedidos, 0);
                 break;

                case 5:
                    repite = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no disponible");
                    repite=false;
                    break;
            }
        } while(repite);
    }

    public static void mostrarArrayRecursivo (int [] cantidadPedidos, int indice) {
        if (indice != (cantidadPedidos.length)){
            JOptionPane.showMessageDialog(null, "Promos " + (indice+1) + " vendidas : " + cantidadPedidos[indice]);
            mostrarArrayRecursivo(cantidadPedidos, indice+1);
        }
    }
}
