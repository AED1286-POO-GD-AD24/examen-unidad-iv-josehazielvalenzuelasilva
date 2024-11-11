package miPrincipal;
import clases.*;

public class Principal {
    
    public static void main(String[] args) {
           
       
            Carrito<Producto> carrito = new Carrito<>(10);
    
            ProductoElectronico laptop = new ProductoElectronico("Laptop", 1200.00);
            ProductoAlimenticio manzana = new ProductoAlimenticio("Manzana", 0.50);
            ProductoAlimenticio salchicha = new ProductoAlimenticio("salchicha", 5);
            ProductoElectronico celular = new ProductoElectronico("celular", 4300.50);
            ProductoAlimenticio mandarina = new ProductoAlimenticio("mandarina", 10);
            ProductoElectronico television = new ProductoElectronico("television", 5000.20);
            ProductoElectronico licuadora = new ProductoElectronico("licuadora", 450);
            ProductoAlimenticio queso = new ProductoAlimenticio("queso", 60);
            ProductoAlimenticio pera = new ProductoAlimenticio("pera", 15);
            ProductoAlimenticio sandia =new ProductoAlimenticio("sandia", 40);

    
            carrito.agregarProducto(laptop);
            carrito.agregarProducto(manzana);
            carrito.agregarProducto(salchicha);
            carrito.agregarProducto(celular);
            carrito.agregarProducto(mandarina);
            carrito.agregarProducto(television);
            carrito.agregarProducto(licuadora);
            carrito.agregarProducto(queso);
            carrito.agregarProducto(pera);
            carrito.agregarProducto(sandia);
    
            carrito.mostrarProductos();
            System.out.println("Total: $" + carrito.calcularTotal());
       
    }
}