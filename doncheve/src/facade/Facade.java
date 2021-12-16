/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;
  import clases.Producto;
  import clases.Descuentos;
/**
 
 * @author ac343
 */
public class Facade {
  
    private Producto productos;
    private Descuentos descuentos;
    
    public Facade(){
        productos = new Producto();
        descuentos = new Descuentos();
    }
    
            
    public void clienteProductos(String f_ini, String f_ven, int no_productos){
        productos.buscar(f_ini, f_ven, no_productos);
        descuentos.buscardescuento(f_ini, f_ven, no_productos);
    }

    
    
    
}