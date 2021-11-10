package Parcial2;

import javax.swing.*;
import java.util.ArrayList;

public class MenuPedido  {

    public static void menu (ArrayList pedidos, int pedido) {
        boolean repite;
        int opcion;
        String op;

        do {
            op= JOptionPane.showInputDialog("       BIENVENIDO    \n"
                    + "1. Hamburguesa.              ($500)\n"
                    + "2. Lomo con Papas.         ($800)\n"
                    + "3. Pizza.                             ($600)\n"
                    + "4. Empanadas (docena)   ($400) \n"
                    + "5. Volver \n");
            opcion=Integer.parseInt(op);


            switch (opcion) {
                case 1:
                    Promo1 hamburguesa = new Promo1(500.00, pedido, 1);
                    JOptionPane.showMessageDialog(null, "Pedido nro --> " + pedido);
                    hamburguesa.pedirDatos(hamburguesa);
                    String h = JOptionPane.showInputDialog(null, "Condimentos \n" +
                            "1 :Mayonesa \n" +
                            "2:Barbacoa \n" +
                            "3:Ambos \n\n" +
                            "Opcion: ");
                    int condimento=Integer.parseInt(h);
                    if (condimento == 1) {
                        hamburguesa.setCondimentos("Mayonesa");
                    } else if (condimento == 2) {
                        hamburguesa.setCondimentos("Barbacoa");
                    } else if (condimento == 3) {
                        hamburguesa.setCondimentos("Mayonesa y Barbacoa");
                    }
                    encolar(hamburguesa, pedidos);
                    hamburguesa.CalculoPrecioFinal();
                    repite = false;
                    break;

                case 2:
                    Promo2 lomo = new Promo2(800.00, pedido, 2);
                    JOptionPane.showMessageDialog(null, "Pedido nro --> " + pedido);
                    lomo.pedirDatos(lomo);
                    String l = JOptionPane.showInputDialog(null,"Pan \n" +
                            "1 :Arabe \n" +
                            "2:Frances \n\n" +
                            "Opcion: ");
                    int pan=Integer.parseInt(l);
                    if (pan == 1) {
                        lomo.setPan("Arabe");
                    } else if (pan == 2) {
                        lomo.setPan("Frances");
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                    }
                    encolar(lomo, pedidos);
                    lomo.CalculoPrecioFinal();
                    repite = false;
                    break;

                case 3:
                    Promo3 pizza = new Promo3(600.00, pedido, 3);
                    JOptionPane.showMessageDialog(null, "Pedido nro --> " + pedido);
                    pizza.pedirDatos(pizza);
                    String p = JOptionPane.showInputDialog(null,"Tipo:\n" +
                            "1 :Muzzarela \n" +
                            "2:Napolitana \n\n" +
                            "Opcion: ");
                    int tipo=Integer.parseInt(p);
                    if (tipo == 1) {
                        pizza.setTipo("Muzzarela");
                    } else if (tipo == 2) {
                        pizza.setTipo("Napolitana");
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                    }
                    encolar(pizza, pedidos);
                    pizza.CalculoPrecioFinal();
                    repite = false;
                    break;

                case 4:
                    Promo4 empanada = new Promo4(400.00, pedido, 4);
                    JOptionPane.showMessageDialog(null, "Pedido nro --> " + pedido);
                    empanada.pedirDatos(empanada);
                    String e = JOptionPane.showInputDialog(null,"Relleno: \n" +
                            "1:Carne \n" +
                            "2:Jamon y Queso \n\n" +
                            "Opcion: ");
                    int relleno=Integer.parseInt(e);
                    if (relleno == 1) {
                        empanada.setRelleno("Carne");
                    } else if (relleno == 2) {
                        empanada.setRelleno("Jamon y Queso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                    }
                    encolar(empanada, pedidos);
                    empanada.CalculoPrecioFinal();
                    repite = false;
                    break;

                case 5:
                    repite = false;
                    pedido -= 1;
                    break;

                default:
                    pedido -= 1;
                    JOptionPane.showMessageDialog(null, "Opcion no disponible");
                    repite = false;
                    break;
            }
        } while (repite);

    }

    public static void encolar (Pedido dato, ArrayList pedidos){
        if(dato != null){
            pedidos.add(dato);
        }
    }

    public static void desencolar (ArrayList pedidos){
        try{
            int nro=0;
            String n = JOptionPane.showInputDialog("Pedido nro: ");
            nro=Integer.parseInt(n);
            pedidos.remove((nro-1));
        }
        catch (IndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "No existe ese numero de pedido");
        }
    }

    public static boolean colaVacia (ArrayList pedidos){
        return pedidos.size() < 1;
    }
}

