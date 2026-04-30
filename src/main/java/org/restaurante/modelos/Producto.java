package org.restaurante.modelos;

public class Producto {
    //Atributos
    private String nombre;
    private double precio;
    private int cantidad;

    //Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //Método para calcular el subtotal a pagar
    public double calcularSubtotal() {
        return precio * cantidad;
    }

    //Se muestran los detalles del pedido
    public String mostrarDetalle() {
        return nombre + "\nPrecio de producto: C$" + precio + "\nCantidad: " + cantidad + "\nSubtotal a pagar: C$" + calcularSubtotal();
    }
}
