package clientes;

import java.util.ArrayList;

public class ColaClientes {

    private ArrayList<Cliente> cola;

    public ColaClientes() {
        cola = new ArrayList<>();
    }

    private boolean estaVacia() {
        return cola.isEmpty();
    }

    public void insertar(Cliente cliente) {

        int i;

        for (i = 0; i < cola.size(); i++) {
            if (cliente.getPrioridad() > cola.get(i).getPrioridad()) {
                break;
            }
        }

        cola.add(i, cliente);
    }

    public Cliente atender() {

        if (estaVacia()) {
            System.out.println("No hay clientes en la cola.");
            return null;
        }

        return cola.remove(0);
    }

    public Cliente verFrente() {

        if (estaVacia()) {
            System.out.println("No hay clientes en la cola.");
            return null;
        }

        return cola.get(0);
    }
}
