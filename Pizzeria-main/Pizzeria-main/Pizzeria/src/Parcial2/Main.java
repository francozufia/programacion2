package Parcial2;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Hashtable <String, String> inicioSesion= new Hashtable<>();

        inicioSesion.put("admin","admin");

        boolean bandera= true;
        do {
            try {
                String usuario = JOptionPane.showInputDialog("Usuario");
                String contrasena = JOptionPane.showInputDialog("Contraseña");


                if((inicioSesion.get("admin").equals(contrasena)) && (inicioSesion.get("admin").equals(usuario))){
                    bandera=false;
                } else if(inicioSesion.get("admin").equals(contrasena)){
                    JOptionPane.showMessageDialog(null,"USUARIO INCORRECTO!");

                } else if (inicioSesion.get("admin").equals(usuario)){
                    JOptionPane.showMessageDialog(null,"CONTRASEÑA INCORRECTA");

                } else {
                    JOptionPane.showMessageDialog(null, "LOS VALORES INGRESADOS NO SON VALIDOS");

                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"ERROR INTENTELO NUEVAMENTE");
            }
        }while (bandera);

        Menu.Pedidos();
    }
}