package org.restaurante.modelos;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }

    public String mostrarDetalle() {
        return nombre + "\nPrecio de producto: C$" + precio + "\nCantidad: " + cantidad + "\nSubtotal a pagar: C$" + calcularSubtotal();
    }
}
