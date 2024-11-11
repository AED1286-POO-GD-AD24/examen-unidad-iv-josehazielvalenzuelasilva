// Clase abstracta Producto
package clases;
public abstract class Producto {
    protected String nombre;
    protected double precio;
    
    
    public Producto() {
        this.nombre = "sin nombre";
        this.precio = 0.0;
    }


    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract String getNombre();
    public abstract double getPrecio();
     
}

