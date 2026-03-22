package tienda;

import arbol.ArbolProductos;
import clientes.ColaClientes;

public class Tienda {

    // ATRIBUTOS
    private ArbolProductos inventario;
    private ColaClientes colaClientes;

    // CONSTRUCTOR
    public Tienda() {
        inventario = new ArbolProductos();
        colaClientes = new ColaClientes();
    }

    // GETTERS
    public ArbolProductos getInventario() {
        return inventario;
    }

    public ColaClientes getColaClientes() {
        return colaClientes;
    }
}