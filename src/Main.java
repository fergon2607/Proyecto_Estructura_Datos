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
            System.out.println("4. Salir");
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
            }

        } while (opcion != 4);
    }
}
