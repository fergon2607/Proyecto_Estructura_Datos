package ListaProductos;

import java.util.ArrayList;

public class NodoProducto {

    // Atributos
    private String nombreProducto;
    private double precio;
    private String categoria;
    private String fechaVencimiento;
    private int cantidad;
    private ArrayList<String> listaImagenes;
    private NodoProducto siguiente;

    // Constructor
    public NodoProducto(String nombreProducto, double precio, String categoria, String fechaVencimiento, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.categoria = categoria;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.listaImagenes = new ArrayList<>();
        this.siguiente = null;
    }

    // Getters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public ArrayList<String> getListaImagenes() {
        return listaImagenes;
    }

    public NodoProducto getSiguiente() {
        return siguiente;
    }

    // Setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSiguiente(NodoProducto siguiente) {
        this.siguiente = siguiente;
    }

    // Método para agregar imágenes
    public void agregarImagen(String rutaImagen) {
        listaImagenes.add(rutaImagen);
    }

    // toString
    @Override
    public String toString() {
        return "\nProducto: " + nombreProducto +
                "\nPrecio: " + precio +
                "\nCategoría: " + categoria +
                "\nFecha Vencimiento: " + fechaVencimiento +
                "\nCantidad: " + cantidad +
                "\nImágenes: " + listaImagenes + "\n";
    }
}

