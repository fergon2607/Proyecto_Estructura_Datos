import ListaProductos.ListaProductos;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListaProductos lista = new ListaProductos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Insertar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Reporte de costos");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Modificar producto");
            System.out.println("6. Agregar imagen");
            System.out.println("7. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    System.out.print("Fecha vencimiento: ");
                    String fecha = sc.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    lista.insertarFinal(nombre, precio, categoria, fecha, cantidad);
                    break;

                case 2:
                    lista.mostrarLista();
                    break;

                case 3:
                    lista.reporteCostos();
                    break;

                case 4:
                    System.out.print("Ingrese nombre del producto a eliminar: ");
                    String eliminar = sc.nextLine();

                    if (lista.eliminar(eliminar)) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese nombre del producto a modificar: ");
                    String modificar = sc.nextLine();

                    if (lista.modificar(modificar)) {
                        System.out.println("Producto modificado.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Nombre del producto: ");
                    String nombreImg = sc.nextLine();

                    System.out.print("Ruta de la imagen: ");
                    String ruta = sc.nextLine();

                    if (lista.agregarImagen(nombreImg, ruta)) {
                        System.out.println("Imagen agregada.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 7);
    }
}