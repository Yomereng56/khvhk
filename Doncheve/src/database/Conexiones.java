/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import interfaz.IConexion;
import database.SQL;
import interfaz.Abstracta;

/**
 *
 * @author ac343
 */
//Clase publica
public class Conexiones implements Abstracta{
    //Creación del gestor de conexion
    public IConexion getConexion(String gestor){
        if (gestor == null)
            System.out.println("No se especifico ningun gestor de BDs");
        if (gestor.equalsIgnoreCase("SQL"))
            return new SQL();
        else
            return null;
    }
}
