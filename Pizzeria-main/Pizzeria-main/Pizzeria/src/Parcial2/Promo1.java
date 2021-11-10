package Parcial2;

import javax.swing.*;

public class Promo1 extends Pedido{
    private String condimentos;

    public String getCondimentos() {
        return condimentos;
    }

    public void setCondimentos(String condimentos) {
        this.condimentos = condimentos;
    }

    public Promo1(double precio, int pedido, int tipoPromo ) {
        super(precio);
        this.pedido = pedido;
        this.tipoPromo = tipoPromo;
    }


    @Override
    public void CalculoPrecioFinal(){
        this.precioFinal = this.cantidad * this.precio;
        JOptionPane.showMessageDialog(null, "Pedido realizado con exito \n"
                +"Total $" + this.precioFinal +" \n");
    }

    @Override
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null,
                "Pedido nro: " + getPedido() + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Celular: " + getCelular() + "\n" +
                "Cantidad de hamburguesas: " + getCantidad() +"\n" +
                "Condimento: " + getCondimentos() +"\n" +
                "Precio Total $" + precioFinal + "\n");
    }

    @Override
    public void pedirDatos(Pedido Promo) {
        super.pedirDatos(Promo);
    }
}






