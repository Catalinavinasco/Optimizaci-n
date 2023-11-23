package com.iudigital.actividad.modelos;

import java.util.ArrayList;
import java.util.List;
public class ClienteProducto {
    
    
    
    private final String nombre;
    private final List<Producto> productos;

   
    public ClienteProducto(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>(); 
    }

   
    public String getNombre() {
        return nombre;
    }

    
    public List<Producto> getProductos() {
        return productos;
    }
    
   
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}


//catalina vinasco