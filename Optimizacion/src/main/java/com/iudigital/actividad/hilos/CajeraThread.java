package com.iudigital.actividad.hilos;

import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;
import javax.swing.JOptionPane;

public class CajeraThread extends Thread {
    private String nombre;
    private ClienteProducto cliente;
    private long tiempoInicial;

    public CajeraThread(String nombre, ClienteProducto cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }
    
    @Override
    public void run() {
        float costoTotalCompra = 0; 
        
        
        JOptionPane.showMessageDialog(null, "La Cajera " + this.nombre 
                + " Comienza a Procesar la Compra del Cliente " 
                + this.cliente.getNombre() + " En el Tiempo: " 
                + (System.currentTimeMillis() -  this.tiempoInicial) / 1000 +  " Seg");
         
        int contCliente = 1;
        
        for (Producto producto : cliente.getProductos()) {
            
            costoTotalCompra += producto.getCantidad() * producto.getPrecio();
            
           
            esperarXsegundos();
               
           
            String mensajeProducto = "Compra realizada para " + cliente.getNombre()
                    +" - Producto "  + contCliente 
                    + " - Nombre: " + producto.getNombre() 
                    + " - Precio: " + producto.getPrecio() 
                    + " - Cantidad: " + producto.getCantidad() 
                    + " - Costo Total: " + producto.getCantidad() * producto.getPrecio() 
                    + " --> Tiempo: " + (System.currentTimeMillis() -  this.tiempoInicial) / 1000 + " Seg";
            JOptionPane.showMessageDialog(null, mensajeProducto);
            contCliente++;
        }
        
      
        String mensajeCostoTotal = "Costo total de la compra para " + cliente.getNombre() + ": " + costoTotalCompra;
        JOptionPane.showMessageDialog(null, mensajeCostoTotal);
         
       
        String mensajeFinalizacion = "La cajera " +  this.nombre + " Ha Terminado de Procesar a el Cliente " 
                + this.cliente.getNombre() + " En el Tiempo " 
                + (System.currentTimeMillis() -  this.tiempoInicial) / 1000 + " Seg";
        JOptionPane.showMessageDialog(null, mensajeFinalizacion); 
    }
    
    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
