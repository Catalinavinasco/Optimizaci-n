package com.iudigital.actividad.compra;
import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public static void main(String[] args) {

       
        List<Producto> productos = new ArrayList<>();

        
        setProductos(productos);

        
        ClienteProducto cliente1 = new ClienteProducto("Catalina Vinasco");
        ClienteProducto cliente2 = new ClienteProducto("Santiago Vinasco");

        
        cliente1.agregarProducto(new Producto("Pera", 2000, 5));
        cliente1.agregarProducto(new Producto("Zanahoroa", 500, 10));
        cliente1.agregarProducto(new Producto("Yogurt", 3500, 5));

       
        cliente2.agregarProducto(new Producto("Limon", 400, 10));
        cliente2.agregarProducto(new Producto("Panela", 3700, 2));
        cliente2.agregarProducto(new Producto("Azucar", 2000, 10));

       
        long tiempoInicial = System.currentTimeMillis();

       
        Cajera cajera1 = new Cajera("MariaC");
        Cajera cajera2 = new Cajera("Valentina");

        
        cajera1.procesarCompra(cliente1, tiempoInicial);
        cajera2.procesarCompra(cliente2, tiempoInicial);
    }

    
    private static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Leche en polvo", 7000, 2);
        Producto producto2 = new Producto("Queso", 5000, 5);
        Producto producto3 = new Producto("Pan", 2000, 10);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
    
    //catalina vinasco
}
