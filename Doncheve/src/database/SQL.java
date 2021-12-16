/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import interfaz.IConexion;
/**
 *
 * @author ac343
 */
//Clase publica
public class SQL implements IConexion{
    //Atributos privados de la base de datos SQL
    private String host;
    private String user;
    private String password;
    private String port;
    private String database;
  //Definir valores para los atributos privados  
    public SQL(){
    this.host = "localhost";
    this.database = "utom";
    this.password = "123456789";
    this.port = "1432";
    this.user = "root";
            
            }
    //Clase void para el resultado de la conexión
    @Override
    public void conectar() {
      //Conectar con SQL
      System.out.println("Descuento semanal actualizado con exito");
    }
    
}
