/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
/**
 *
 * @author ac343
 */
public class Producto {
     public static String productos (String fecha_inicio, String fecha_vencimiento, int no_productos){
         String[] productos = {"Refrescos","Limpieza","chicles","Cerveza","Frituras"};
         int indice = 0;
         if(fecha_inicio.startsWith("3"))
             indice = numeroAleatorio(0, productos.length - 4);
         else if(fecha_vencimiento.startsWith("10"))
             indice = numeroAleatorio(0, productos.length - 2);
         else
             indice = numeroAleatorio(0, productos.length -1);
         
         String productoElegido = productos[indice];
         return productoElegido; 
     }
         
    public void buscar(String f_ini, String f_ven, int no_productos){
  String resultado = Producto.productos(f_ini, f_ven, no_productos);
JOptionPane.showMessageDialog(null,"\nEl descuento de hoy es en: " + resultado +
        "\nInicia el " + f_ini + " \nVence el: " + f_ven + 
                "\nEl descuento es presentado por Don Cheve");       
}
      
    public static int numeroAleatorio(int minimo, int maximo){
    return ThreadLocalRandom.current().nextInt(minimo, maximo);
}
}