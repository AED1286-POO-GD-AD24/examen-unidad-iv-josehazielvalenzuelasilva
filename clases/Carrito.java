package clases;

// Clase Carrito
public class Carrito<T extends Producto> {
    private T[] productos;  // Array para almacenar los productos
    private int indice;     // Índice para rastrear el número de productos en el carrito

    // Constructor para inicializar el carrito con una capacidad específica
    @SuppressWarnings("unchecked")
    public Carrito(int capacidad) {
        productos = (T[]) new Producto[capacidad];  // Inicializa losproductos
        indice = 0;
    }

    // Método para agregar un producto al carrito
    public void agregarProducto(T producto) {
        if (indice < productos.length) {
            productos[indice++] = producto;  // Agrega el producto al carrito
        } else {
            System.out.println("Carrito lleno, no se puede agregar más productos.");
        }
    }

    // Método para calcular el total del carrito sumando los precios de los productos
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < indice; i++) {
            total += productos[i].getPrecio();  // Suma el precio de cada producto
        }
        return total;
    }

    // Método para mostrar los productos del carrito
    public void mostrarProductos() {
        for (int i = 0; i < indice; i++) {
            System.out.println("Producto: " + productos[i].getNombre() + " - Precio: " + productos[i].getPrecio());
        }
    }
}
