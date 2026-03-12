package ui;

// importamos herramientas necesarias
import java.util.Scanner;         // lee lo que el usuario escribe
import model.Carrito;             // lógica de la canasta
import model.Producto;            // manejar los lentes/productos
import exception.CantidadInvalidaException; //validar cantidades

public class Menu {
    // atributos de nuestra interfaz
    private Scanner scanner; 
    private Carrito carrito;

    // inicia el menú cuando el programa arranca
    public Menu() {
        this.scanner = new Scanner(System.in);
        this.carrito = new Carrito();
    }

    // bucle principal del programa
    public void mostrarMenuPrincipal() {
        int opcion = 0;
        do {    
            System.out.println(" BIENVENIDO A ÓPTICA MULTIFOCUS ");
            System.out.println("1. Ver Catálogo y Comprar");
            System.out.println("2. Ver mi Carrito");
            System.out.println("3. Finalizar Compra (Ir a caja)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                // lee y convierte a número la opcion ingresada
                opcion = Integer.parseInt(scanner.nextLine());
                procesarOpcion(opcion);
            } catch (NumberFormatException e) {
                // error si se ingresan letras
                System.out.println(">> Error: Por favor, ingrese un número del 1 al 4.");
            }
        } while (opcion != 4); // El ciclo sigue hasta que el usuario elige 4
    }

    // logica segun opcion elegida
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                ejecutarCompra(); // logica de compra separada
                break;
            case 2:
                // Llamamos lo que creamos en carrito
                carrito.mostrarCarrito(); 
                break;
            case 3:
                // Mostramos el total acumulado antes de cerrar
                System.out.println("\n----------------------------------------");
                System.out.println("RESUMEN DE VENTA:");
                System.out.println("Total Base a pagar: $" + carrito.calcularTotalBase());
                System.out.println("¡Gracias por preferir Multifocus!");
                System.out.println("----------------------------------------");
                System.exit(0); // Cierra el programa completamente
                break;
            case 4:
                System.out.println("Cerrando sistema... ¡Hasta pronto!");
                break;
            default:
                System.out.println(">> Opción no válida. Intente nuevamente.");
        }
    }

    // logica simular la selección de productos
    private void ejecutarCompra() {
        System.out.println("\n-PRODUCTOS DISPONIBLES-");
        // Por ahora creamos un producto para probar
        Producto p1 = new Producto(1, "Marco Angelo Falcony", "Ópticos", 85000);
        
        System.out.println(p1.toString()); // Usamos el toString que configuramos con @Override
        
        System.out.print("\n¿Desea agregar este producto al carrito? (s/n): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            carrito.agregarProducto(p1);
            System.out.println(">> ¡Éxito! Producto añadido al carrito.");
        } else {
            System.out.println(">> Producto no agregado, favor reintente.");
        }
    }
}