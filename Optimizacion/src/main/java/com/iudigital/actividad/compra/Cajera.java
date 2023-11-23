package com.iudigital.actividad.compra;
import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;
import javax.swing.JOptionPane;

public class Cajera {

    
    private String nombre;

    
    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    
    public void procesarCompra(ClienteProducto cliente, long timeStamp) {
        float costoTotalCompra = 0; 

       
        JOptionPane.showMessageDialog(null, "<html>La Cajera: <font color='blue'>" + this.nombre
                + "</font><br>Comienza a procesar la compra del cliente: <font color='blue'>"
                + cliente.getNombre()
                + "</font><br>Tiempo transcurrido: "
                + (System.currentTimeMillis() - timeStamp) / 1000 + " Seg</html>");

        
        for (Producto producto : cliente.getProductos()) {
         
            esperarXsegundos();

           
            costoTotalCompra += producto.getCantidad() * producto.getPrecio();

           
            String mensajeProducto = "<html>Compra realizada - Producto<br>"
                    + "Nombre: " + producto.getNombre()
                    + "<br>Precio: " + producto.getPrecio()
                    + "<br>Cantidad: " + producto.getCantidad()
                    + "<br>Costo Total: " + producto.getCantidad() * producto.getPrecio()
                    + "<br>Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " Seg</html>";
            JOptionPane.showMessageDialog(null, mensajeProducto);
        }

       
        String mensajeCostoTotal = "Costo total de la compra: " + costoTotalCompra;
        JOptionPane.showMessageDialog(null, mensajeCostoTotal);

        
        String mensajeFinalizacion = "<html>La cajera: <font color='blue'>" + this.nombre
                + "</font><br>ha terminado de procesar al cliente: <font color='blue'>"
                + cliente.getNombre()
                + "</font><br>en el tiempo transcurrido de: "
                + (System.currentTimeMillis() - timeStamp) / 1000 + " Seg</html>";
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
