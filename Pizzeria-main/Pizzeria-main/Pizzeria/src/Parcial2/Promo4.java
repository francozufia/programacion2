package Parcial2;

import javax.swing.*;

public class Promo4 extends Pedido {
    private String Relleno;

    public String getRelleno() {
        return Relleno;
    }

    public void setRelleno (String Relleno){this.Relleno = Relleno;}

    public Promo4(double precio, int pedido, int tipoPromo ) {
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
                        "Cantidad de empanadas: " + getCantidad() +"\n" +
                        "Relleno: " + getRelleno() +"\n" +
                        "Precio Total $" + precioFinal + "\n");
    }

    @Override
    public void pedirDatos(Pedido Promo) {
        super.pedirDatos(Promo);
    }
}
