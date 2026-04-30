import org.example.Calculadora;
import org.example.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    void precioProducto() {

        // Organizar
        Producto producto1 = new Producto("Cuaderno", 5000, 10);
        // Actuar
        double precio = producto1.getPrecio();
        // Afirmar
        assertEquals(5000, precio);
    }

    @Test
    void productoEstaDisponible(){
        Producto producto2 = new Producto("Lapiz", 2000, 5);
        boolean resultado = producto2.estaDisponible();
        assertTrue(resultado);
    }

    @Test
    void productoNoDisponible(){
        Producto producto3 = new Producto("Borrador", 500, 0);
        boolean resultado = producto3.estaDisponible();
        assertTrue(resultado == false);

    }

    @Test
    void reducirStockDisminuyeCorrectamente() {
        Producto producto4 = new Producto("Regla", 2000, 10);
        producto4.reducirStock(3);
        assertEquals(7, producto4.getStock());
    }

    @Test
    void reducirStockMasDeDisponible() {
        Producto producto4 = new Producto("Regla", 2000, 10);
        assertThrows(IllegalArgumentException.class,
                ()->{
                    producto4.reducirStock(12);
                });
    }

    @Test
    void productoPrecioNegativo() {
        assertThrows(IllegalArgumentException.class,
                ()->{
                    Producto producto4 = new Producto("Regla", -2000, 10);
                });
    }

    //¿Qué comportamiento están probando?
    //Se comprueba que al crear un preducto, éste tiene el mismo nombre que se le envió por parámetro
    //¿Qué aserción van a usar y por qué?
    //AssertEquals, porque necesitamos comparar el nombre actual del producto con el que se le envió por pará metro
    //¿Qué valor esperan obtener?
    //El mismo nombre enviado por parámetro
    @Test
    void validarMismoNombreProducto() {
        Producto producto4 = new Producto("Carpeta", 3000, 4);
        String nombre = producto4.getNombre();
        assertEquals("Carpeta", nombre);
    }

}
