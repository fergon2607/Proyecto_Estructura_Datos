package ListaProductos;

import java.util.ArrayList;

public class NodoProducto {

    // ATRIBUTOS
    private String nombreProducto;
    private double precio;
    private String categoria;
    private String fechaVencimiento;
    private int cantidad;
    private ArrayList<String> listaImagenes;
    private NodoProducto siguiente;


    // CONSTRUCTOR
    public NodoProducto(String nombreProducto, double precio, String categoria, String fechaVencimiento, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.categoria = categoria;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.listaImagenes = new ArrayList<>(); // inicialización correcta
        this.siguiente = null; // nodo sin enlace inicial
    }

    // GETTERS
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

    // SETTERS
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

    // METODOS

    // Agregar imagen al producto
    public void agregarImagen(String rutaImagen) {
        listaImagenes.add(rutaImagen);
    }

    // TOSTRING
    @Override
    public String toString() {
        return "\nProducto: " + nombreProducto +
                "\nPrecio: " + precio +
                "\nCategoría: " + categoria +
                "\nFecha Vencimiento: " + fechaVencimiento +
                "\nCantidad: " + cantidad +
                "\nCantidad de imágenes: " + listaImagenes.size() +
                "\nImágenes: " + listaImagenes + "\n";
    }
}