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
//Clase publica
public class Facade {
    //Facade privados de producto y descuento
    private Producto productos;
    private Descuentos descuentos;
    
    
    //Facade publicos producto y descuento
    public Facade(){
        productos = new Producto();
        descuentos = new Descuentos();
    }
    
    //Mandar a llamar los atributos de producto y descuento
    public void clienteProductos(String f_ini, String f_ven, int no_productos){
        productos.buscar(f_ini, f_ven, no_productos);
        descuentos.buscardescuento(f_ini, f_ven, no_productos);
    }
}
