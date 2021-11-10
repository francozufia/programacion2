package Parcial2;

import javax.swing.*;

public abstract class Pedido {

    protected long celular = 0;
    protected int cantidad = 0;
    protected String nombre = "";
    protected double precioFinal = 0;
    protected double precio ;
    protected int pedido;
    protected int tipoPromo ;

    public Pedido(){}

    public Pedido(long celular, int cantidad, String nombre, double precio , int pedido , int tipoPromo) {
        this.celular = celular;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
        this.pedido = pedido;
        this.tipoPromo = tipoPromo;
    }
    
     public void pedirDatos(Pedido Promo){
        boolean salida=true;
        do{
            try{
                String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad (en numero): ");
                Promo.setCantidad(Integer.parseInt(cantidad));
                String celular = JOptionPane.showInputDialog("Indique numero de celular: ");
                Promo.setCelular(Long.parseLong(celular));
                String nombre = JOptionPane.showInputDialog("Indique nombre: ");
                Promo.setNombre(nombre);
                salida=false;
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"ERROR INTENTELO NUEVAMENTE");

            }
        } while (salida);
    }

    public Pedido(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTipoPromo() {
        return tipoPromo;
    }

    public void setTipoPromo(int tipoPromo) {
        this.tipoPromo = tipoPromo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }


    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public abstract void CalculoPrecioFinal ();

    public abstract void MostrarDatos ();
}
