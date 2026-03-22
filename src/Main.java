import tienda.Tienda;
import clientes.Cliente;
import arbol.Producto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tienda tienda = new Tienda();

        int opcion;

        do {
            System.out.println("\n=== SISTEMA TIENDA ===");
            System.out.println("1. Agregar producto al inventario");
            System.out.println("2. Agregar cliente a la cola");
            System.out.println("3. Atender cliente");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                // =========================
                // INSERTAR PRODUCTO
                // =========================
                case 1: {

                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    tienda.getInventario().insertar(nombre, precio);

                    System.out.println("Producto agregado al inventario.");
                    break;
                }

                // =========================
                // AGREGAR CLIENTE
                // =========================
                case 2: {

                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();

                    System.out.print("Prioridad (1-3): ");
                    int prioridad = sc.nextInt();
                    sc.nextLine();

                    // Validación de prioridad
                    if (prioridad < 1 || prioridad > 3) {
                        System.out.println("Prioridad inválida. Se asigna 1 por defecto.");
                        prioridad = 1;
                    }

                    Cliente cliente = new Cliente(nombre, prioridad);

                    // Llenar carrito
                    String continuar;

                    do {
                        System.out.print("Nombre del producto a agregar: ");
                        String nombreProducto = sc.nextLine();

                        Producto p = tienda.getInventario().buscar(nombreProducto);

                        if (p != null) {
                            cliente.getCarrito().insertarFinal(
                                    p.getNombre(),
                                    p.getPrecio(),
                                    "general",
                                    "N/A",
                                    1
                            );
                            System.out.println("Producto agregado al carrito.");
                        } else {
                            System.out.println("Producto no existe en inventario.");
                        }

                        System.out.print("¿Agregar otro producto? (s/n): ");
                        continuar = sc.nextLine();

                    } while (continuar.equalsIgnoreCase("s"));

                    tienda.getColaClientes().insertar(cliente);

                    System.out.println("Cliente agregado a la cola.");
                    break;
                }

                // =========================
                // ATENDER CLIENTE
                // =========================
                case 3: {

                    Cliente cliente = tienda.getColaClientes().atender();

                    // Validación si no hay clientes
                    if (cliente == null) {
                        System.out.println("No hay clientes en la cola.");
                        break;
                    }

                    System.out.println("\n======================");
                    System.out.println("       FACTURA");
                    System.out.println("======================");
                    System.out.println("Cliente: " + cliente.getNombre());
                    System.out.println("Prioridad: " + cliente.getPrioridad());
                    System.out.println("----------------------");

                    cliente.getCarrito().mostrarLista();

                    System.out.println("----------------------");
                    cliente.getCarrito().reporteCostos();
                    System.out.println("======================");

                    break;
                }

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);
    }
}