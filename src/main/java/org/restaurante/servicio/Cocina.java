package org.restaurante.servicio;

import org.restaurante.modelos.Pedido;

import javax.swing.*;

public class Cocina {
    private String encargado;

    public Cocina(String encargado) {
        this.encargado = encargado;
    }

    public void procesarPedido(Pedido pedido) {
        pedido.cambiarEstado("Pedido en preparación");
        JOptionPane.showMessageDialog(null, "La cocina está preparando el pedido...");

        pedido.cambiarEstado("Pedido listo");
        JOptionPane.showMessageDialog(null, "Pedido terminado por cocina!");
    }
}
