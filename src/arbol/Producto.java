package arbol;

public class Producto {

    private String nombre;
    private double precio;
    private Producto izquierdo;
    private Producto derecho;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.izquierdo = this.derecho = null;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    public Producto getIzquierdo() { return izquierdo; }
    public Producto getDerecho() { return derecho; }

    public void setIzquierdo(Producto izquierdo) { this.izquierdo = izquierdo; }
    public void setDerecho(Producto derecho) { this.derecho = derecho; }

    @Override
    public String toString() {
        return nombre + " - ₡" + precio;
    }
}