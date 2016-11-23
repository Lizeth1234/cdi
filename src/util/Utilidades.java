/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dueñes
 */
public class Utilidades {
 
 
    
    
    public static String convertirFechasAString(Date fecha) {
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String fechacomvertida=format.format(fecha);
        
        return fechacomvertida;
    }
    
    /**
     *
     * @return
     */
    public static Date ponerFecha(String fecha) {
       
             Date fechaDate = null;
        
             SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
             
        
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }

       
        
        return fechaDate;
        
    }

    
    
    
}
