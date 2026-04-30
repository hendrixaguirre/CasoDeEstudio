package org.restaurante.main;

import org.restaurante.modelos.Cliente;
import org.restaurante.modelos.Pedido;
import org.restaurante.servicio.Cajero;
import org.restaurante.servicio.Cocina;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Se solicitan todos los datos necesarios sobre el cliente, cajero y encargado de cocina.

        String nCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");

        String carnetCliente = JOptionPane.showInputDialog("Ingrese No. de carnet del cliente: ");

        String nCajero = JOptionPane.showInputDialog("Ingrese el nombre del cajero: ");

        String nCocinero = JOptionPane.showInputDialog("Ingrese el nombre del encargado de cocina: ");

        //Se crean los objetos necesarios para el proceso de pedido, registro, preparación y entrega.

        Cliente cliente = new Cliente(nCliente, carnetCliente);

        Cajero cajero = new Cajero(nCajero);

        Cocina cocina = new Cocina(nCocinero);

        //Se utilizan los métodos definidos en las otras clases

        Pedido pedido = cliente.realizarPedido();

        cajero.registrarPedido(pedido);

        cajero.enviarPedidoACocina(pedido, cocina);

        cajero.entregarPedido(cliente, pedido);

        //Se muestra la factura del pedido

        JOptionPane.showMessageDialog(null, pedido.generarFactura());


    }
}