package tiendas.ventas.test;

import tienda.ventas.*;

public class VentasTest {

    public static void main(String[] args) {
        //creamos productos 
        Producto productoCamisa = new Producto("Camisa", 50.25);
        Producto productoPantalon = new Producto("Pantalon", 100);

        //cramos la orden
        Orden orden1 = new Orden();
        orden1.agregarProducto(productoCamisa);
        orden1.agregarProducto(productoPantalon);
        orden1.mostrarOrden();

    }
}
