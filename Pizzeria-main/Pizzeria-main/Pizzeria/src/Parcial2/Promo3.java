package Parcial2;

import javax.swing.*;

public class Promo3 extends  Pedido{
        private String Tipo;

        public String getTipo() {
            return Tipo;
        }

        public void setTipo (String Tipo){this.Tipo = Tipo;}

        public Promo3(double precio, int pedido, int tipoPromo ) {
            super(precio);
            this.pedido = pedido;
            this.tipoPromo = tipoPromo;
        }

        @Override
        public void CalculoPrecioFinal(){
            this.precioFinal = this.cantidad * this.precio;
            JOptionPane.showMessageDialog(null, "Pedido realizado con exito \n"
                    + "Total $" + this.precioFinal +" \n");
        }

        @Override
        public void MostrarDatos(){
            JOptionPane.showMessageDialog(null,
                    "Pedido nro: " + getPedido() + "\n" +
                            "Nombre: " + getNombre() + "\n" +
                            "Celular: " + getCelular() + "\n" +
                            "Cantidad de pizzas: " + getCantidad() +"\n" +
                            "Tipo: " + getTipo() +"\n" +
                            "Precio Total $" + precioFinal + "\n");
        }

    @Override
    public void pedirDatos(Pedido Promo) {
        super.pedirDatos(Promo);
    }
}
