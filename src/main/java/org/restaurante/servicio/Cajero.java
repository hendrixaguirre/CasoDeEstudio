package org.restaurante.servicio;

import org.restaurante.modelos.Cliente;
import org.restaurante.modelos.Pedido;

import javax.swing.*;

public class Cajero {
    private String nombre;

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    public void registrarPedido(Pedido pedido) {
        pedido.cambiarEstado("Registrado exitosamente!");
        JOptionPane.showMessageDialog(null, "El cajero " + nombre + " ha registrado exitosamente el pedido!");
    }

    public void enviarPedidoACocina(Pedido pedido, Cocina cocina) {JOptionPane.showMessageDialog(null, "El pedido ha sido enviado a cocina!");
        cocina.procesarPedido(pedido);
    }

    public void entregarPedido(Cliente cliente, Pedido pedido) {
        pedido.cambiarEstado("Pedido entregado");
        JOptionPane.showMessageDialog(null, "El pedido ha sido entregado a " + cliente.getNombre());
    }
}
