package com.iudigital.actividad.hilos;

import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteThread {
    
    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        
       
        setProductos(productos);
        
        
        ClienteProducto cliente1 = new ClienteProducto("Catalina Vinasco");
        ClienteProducto cliente2 = new ClienteProducto("Gabriel Ortiz");
        
       
        cliente1.agregarProducto(new Producto("Pollo", 10000, 3));
        cliente1.agregarProducto(new Producto("Lechuga", 1000, 10));
        cliente1.agregarProducto(new Producto("Arroz", 2500, 10));

       
        cliente2.agregarProducto(new Producto("Salchicha", 5000, 4));
        cliente2.agregarProducto(new Producto("Leche", 3800, 5));
        cliente2.agregarProducto(new Producto("Arepas", 1600, 10));
        
        
        long tiempoInicial = System.currentTimeMillis();
           
        
        CajeraThread Cajera1 = new CajeraThread("MariaC", cliente1, tiempoInicial);
        CajeraThread Cajera2 = new CajeraThread("Valentins", cliente2, tiempoInicial);
        
       
        Cajera1.start();
        Cajera2.start();
        
    }
        
    
    private static void setProductos(List<Producto> productos) {
        // Agregar productos al cliente 1
        Producto producto1 = new Producto("Manzana", 1200, 10);
        Producto producto2 = new Producto("Naranja", 400, 12);
        Producto producto3 = new Producto("Leche Caja", 2500, 4);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}

    

