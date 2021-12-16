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
public class Descuentos {
    public static String descuentos (String fecha_ini, String fecha_venci, int no_descuentos){
         String[] descuentos = {"10%","20%","50%","15%","5%"};
         int indice = 0;
         if(fecha_ini.startsWith("3"))
             indice = numeroAleator(0, descuentos.length - 5);
         else if(fecha_venci.startsWith("15"))
             indice = numeroAleator(0, descuentos.length - 2);
         else
             indice = numeroAleator(0, descuentos.length -1);
         String descuentoElegido = descuentos[indice];
         return descuentoElegido; 
     }
    
    
    public void buscardescuento(String f_inic,String f_venc, int no_descuentos){
    String resultado = Descuentos.descuentos(f_inic, f_venc, no_descuentos);
JOptionPane.showMessageDialog(null,"\nEl descuento de hoy es del: " + resultado +  ".");       
}
      
    public static int numeroAleator(int minimo, int maximo){
    return ThreadLocalRandom.current().nextInt(minimo, maximo);
}
}