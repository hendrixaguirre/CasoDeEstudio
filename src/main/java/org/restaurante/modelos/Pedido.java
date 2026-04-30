package org.restaurante.modelos;

import java.util.ArrayList;

public class Pedido {
    //Atributos
    private int codigoPedido;
    private ArrayList<Producto> productos;
    private String estado;

    //Constructor
    public Pedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    //Método para agregar productos en el arrayList
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    //Método para calcular el total de la factura
    public double calcularTotal() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.calcularSubtotal();
        }
        return total;
    }

    //Método para cambiar el estado del pedido
    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    //Generación de la factura del pedido
    public String generarFactura() {
        String factura = "---------------- FACTURA ----------------\n";
        factura += "Pedido No.: " + codigoPedido + "\n";
        factura += "Estado de pedido: " + estado + "\n\n";

        for (Producto producto : productos) {
            factura += producto.mostrarDetalle() + "\n\n";
        }
        factura += "Total a pagar: C$" + calcularTotal();
        return factura;
    }
}
