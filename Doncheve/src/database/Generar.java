/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import interfaz.Abstracta;
import database.Conexiones;

/**
 *
 * @author ac343
 */
//Clase publica
public class Generar {
    //Creación del ciclo if para la conexión.
    public static Abstracta getConexion(String tipoFabrica){
        if(tipoFabrica.equalsIgnoreCase("Conexiones"))
            return new Conexiones();
        else
            return null;
    }
}
