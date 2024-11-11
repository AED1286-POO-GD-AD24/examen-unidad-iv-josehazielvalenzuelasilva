package clases;
// Clase ProductoAlimenticio que extienda de Producto
public class ProductoAlimenticio extends Producto{
    public ProductoAlimenticio(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
}


