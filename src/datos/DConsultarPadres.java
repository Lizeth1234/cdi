/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dueñes
 */
public class DConsultarPadres {
    
    public static ResultSet consultarPadres(){
        ResultSet rs=null;
        try {
            Statement st=Conexion.getConect().createStatement();
                           
         rs=st.executeQuery("select * from padres");
            
        } catch (SQLException ex) {
            Logger.getLogger(DConsultarPadres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return rs;
    }
    
    
    
    
     public static ResultSet consultarPadres(String nit){
        ResultSet rs=null;
        try {
            Statement st=Conexion.getConect().createStatement();
                           
         rs=st.executeQuery("select * from padres where nit_padre='"+nit+"'");
        

            
        } catch (SQLException ex) {
            Logger.getLogger(DConsultarPadres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return rs;
    }
    
    
    
}
