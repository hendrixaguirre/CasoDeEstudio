package org.restaurante.modelos;

import javax.swing.*;

public class Cliente {
    private String nombre;
    private String carnet;

    public Cliente(String nombre, String carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public Pedido realizarPedido() {
        int codigoPedido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código del pedido: "));

        Pedido pedido = new Pedido(codigoPedido);

        int opcion;

        do {
            String nombreProducto = JOptionPane.showInputDialog("Ingrese nombre del producto: ");

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del producto: "));

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));

            Producto producto = new Producto(nombreProducto, precio, cantidad);

            pedido.agregarProducto(producto);

            opcion = JOptionPane.showConfirmDialog(null, "Desea agregar otro producto?");

        } while (opcion == JOptionPane.YES_OPTION);
        return pedido;
    }

    public String getNombre() {
        return nombre;
    }
}
