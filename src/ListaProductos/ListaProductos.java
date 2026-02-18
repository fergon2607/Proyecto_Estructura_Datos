package ListaProductos;

public class ListaProductos {

    private NodoProducto primero;

    public ListaProductos() {
        primero = null;
    }

    private boolean estaVacia() {
        return primero == null;
    }

    // Insertar al inicio
    public void insertarInicio(String nombre, double precio, String categoria, String fechaVencimiento, int cantidad) {
        NodoProducto nuevo = new NodoProducto(nombre, precio, categoria, fechaVencimiento, cantidad);
        nuevo.setSiguiente(primero);
        primero = nuevo;
    }

    // Insertar al final
    public void insertarFinal(String nombre, double precio, String categoria, String fechaVencimiento, int cantidad) {
        NodoProducto nuevo = new NodoProducto(nombre, precio, categoria, fechaVencimiento, cantidad);

        if (estaVacia()) {
            primero = nuevo;
            return;
        }

        NodoProducto temp = primero;

        while (temp.getSiguiente() != null) {
            temp = temp.getSiguiente();
        }

        temp.setSiguiente(nuevo);
    }

    // Mostrar lista
    public void mostrarLista() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoProducto temp = primero;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.getSiguiente();
        }
    }

    // Buscar producto
    public NodoProducto buscar(String nombre) {
        NodoProducto temp = primero;

        while (temp != null && !temp.getNombreProducto().equalsIgnoreCase(nombre)) {
            temp = temp.getSiguiente();
        }

        return temp;
    }

    // Reporte de costos
    public void reporteCostos() {
        NodoProducto temp = primero;
        double totalGeneral = 0;

        while (temp != null) {
            double totalProducto = temp.getPrecio() * temp.getCantidad();
            System.out.println("Producto: " + temp.getNombreProducto() +
                    " | Total: " + totalProducto);
            totalGeneral += totalProducto;
            temp = temp.getSiguiente();
        }

        System.out.println("\nTOTAL GENERAL: " + totalGeneral);
    }
}

