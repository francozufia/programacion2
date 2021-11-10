package Parcial2;

import javax.swing.*;

public class Promo2 extends Pedido {
    private String pan;

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Promo2(double precio, int pedido, int tipoPromo ) {
        super(precio);
        this.pedido = pedido;
        this.tipoPromo = tipoPromo;
    }

    @Override
    public void CalculoPrecioFinal(){
        this.precioFinal = this.cantidad * this.precio;
        JOptionPane.showMessageDialog(null,"Pedido realizado con exito \n"
                + "Total $" + this.precioFinal +" \n");
    }

    @Override
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null,
                "Pedido nro: " + getPedido() + "\n" +
                        "Nombre: " + getNombre() + "\n" +
                        "Celular: " + getCelular() + "\n" +
                        "Cantidad de lomos: " + getCantidad() +"\n" +
                        "Pan: " + getPan() +"\n" +
                        "Precio Total $" + precioFinal + "\n");
    }

    @Override
    public void pedirDatos(Pedido Promo) {
        super.pedirDatos(Promo);
    }
}