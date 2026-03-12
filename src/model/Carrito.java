package model;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    // usamos listas
    private List<Producto> items;

    public Carrito() {
        this.items = new ArrayList<>();
    }

    // agregamos productos
    public void agregarProducto(Producto producto) {
        items.add(producto);
    }

    // sumamos valor de productos
    public double calcularTotalBase() {
        double total = 0;
        for (Producto p : items) {
            total += p.getPrecio();
        }
        return total;
    }

    // mostrar carrito
    public void mostrarCarrito() {
        if (items.isEmpty()) {
            System.out.println("Tu carrito está vacío.");
        } else {
            System.out.println("-Tu Carrito Multifocus-");
            for (Producto p : items) {
                System.out.println(p);
            }
            System.out.println("-----------------------------");
            System.out.println("Total Base: $" + calcularTotalBase());
        }
    }

    public List<Producto> getItems() {
        return items;
    }
}