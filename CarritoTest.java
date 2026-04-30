import org.example.Carrito;
import org.example.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {

    @Test
    void carritoRecienCreadoVacio(){
        Carrito carrito1 = new Carrito();
        boolean vacio = carrito1.estaVacio();
        assertTrue(vacio);
    }

    @Test
    void agregarProducto(){
        Carrito carrito2 = new Carrito();
        Producto producto1 = new Producto("Cuaderno", 5000, 1);
        carrito2.agregar(producto1);
        int cantidad = carrito2.cantidadDeProductos();
        assertEquals(cantidad,1);
    }

    @Test
    void totalCarritoDosProductos(){
        Carrito carrito2 = new Carrito();
        Producto producto1 = new Producto("Cuaderno", 5000, 1);
        Producto producto2 = new Producto("Lapiz", 2000, 1);
        carrito2.agregar(producto1);
        carrito2.agregar(producto2);
        double total = carrito2.calcularTotal();
        assertEquals(total,7000);
    }

    @Test
    void carritoNoEstaVacio(){
        Carrito carrito2 = new Carrito();
        Producto producto1 = new Producto("Cuaderno", 5000, 1);
        carrito2.agregar(producto1);
        boolean vacio = carrito2.estaVacio();
        assertFalse(vacio);
    }

    @Test
    void totalCarritoVacio(){
        Carrito carrito2 = new Carrito();
        double total = carrito2.calcularTotal();
        assertEquals(total, 0);
    }

}
