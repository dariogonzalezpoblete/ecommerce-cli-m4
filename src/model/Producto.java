package model;

public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private double precio;

    public Producto(int id, String nombre, String categoria, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        // precio debe ser mayor a 0
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 1.0; 
        }
    }

    // esto permite al menu leer los datos
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }

//en este apartado sobreescribimos el mensaje y ordenamos nuestros item
    @Override
    public String toString() {
        return String.format("ID: %d | %-20s | %-15s | Precio: $%.2f", 
                id, nombre, categoria, precio);
    }
}