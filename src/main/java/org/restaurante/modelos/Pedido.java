package org.restaurante.modelos;

import java.util.ArrayList;

public class Pedido {
    private int codigoPedido;
    private ArrayList<Producto> productos;
    private String estado;

    public Pedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.calcularSubtotal();
        }
        return total;
    }

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
