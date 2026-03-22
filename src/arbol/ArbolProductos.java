package arbol;

public class ArbolProductos {

    private Producto raiz;

    public ArbolProductos() {
        raiz = null;
    }

    private boolean estaVacio() {
        return raiz == null;
    }

    public void insertar(String nombre, double precio) {

        Producto nuevo = new Producto(nombre, precio);

        if (estaVacio()) {
            raiz = nuevo;
            return;
        }

        Producto temp = raiz;
        Producto padre;

        while (true) {

            padre = temp;

            if (nombre.compareTo(temp.getNombre()) < 0) {

                temp = temp.getIzquierdo();

                if (temp == null) {
                    padre.setIzquierdo(nuevo);
                    return;
                }

            } else if (nombre.compareTo(temp.getNombre()) > 0) {

                temp = temp.getDerecho();

                if (temp == null) {
                    padre.setDerecho(nuevo);
                    return;
                }

            } else {
                System.out.println("Producto ya existe.");
                return;
            }
        }
    }

    public Producto buscar(String nombre) {

        Producto temp = raiz;

        while (temp != null) {

            if (nombre.equals(temp.getNombre())) return temp;

            if (nombre.compareTo(temp.getNombre()) < 0)
                temp = temp.getIzquierdo();
            else
                temp = temp.getDerecho();
        }

        return null;
    }
}