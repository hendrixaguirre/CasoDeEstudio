package org.restaurante.servicio;

import org.restaurante.modelos.Pedido;

import javax.swing.*;

public class Cocina {
    //Atributos
    private String encargado;

    //Constructor
    public Cocina(String encargado) {
        this.encargado = encargado;
    }

    //Método para procesar el pedido, utilizando JOptionPane para mostrar mensajes al usuario
    public void procesarPedido(Pedido pedido) {
        pedido.cambiarEstado("Pedido en preparación");
        JOptionPane.showMessageDialog(null, "La cocina está preparando el pedido...");

        pedido.cambiarEstado("Pedido listo");
        JOptionPane.showMessageDialog(null, "Pedido terminado por cocina!");
    }
}
