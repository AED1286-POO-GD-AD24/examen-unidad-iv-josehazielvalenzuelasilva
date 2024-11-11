package clases;
// Clase ProductoElectronico que extienda de producto
public class ProductoElectronico extends Producto{

    public ProductoElectronico(String nombre, double precio) {
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

