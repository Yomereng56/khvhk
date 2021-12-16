/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doncheve;
import database.Conexiones;
import database.Generar;
import facade.Facade;
import interfaz.Abstracta;
import interfaz.IConexion;
import javax.swing.JOptionPane;
/**
 *
 * @author JOEL
 */
public class Doncheve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           //Creación de los clientes con su fecha de pedido.
        Facade cliente_Cesar = new Facade();
        cliente_Cesar.clienteProductos("22/11/2021", "01/12/2021", 7);
        
        Facade cliente_Joel = new Facade();
        cliente_Joel.clienteProductos("25/11/2021", "30/12/2021", 2);
        
     //Generar la conexion de SQL
    Abstracta conexionC = Generar.getConexion("Conexiones");
    Conexiones conecta = new Conexiones();
     
        IConexion conSQL = conexionC.getConexion("SQL");
        conSQL.conectar();
         
    

         
    }

    
}
