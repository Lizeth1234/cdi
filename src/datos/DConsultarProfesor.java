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
public class DConsultarProfesor {

  public static ResultSet consultarProfesor(){
        ResultSet rs=null;
        try {
            Statement st=Conexion.getConect().createStatement();
                           
         rs=st.executeQuery("select * from profesor");
            
        } catch (SQLException ex) {
            Logger.getLogger(DConsultarProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return rs;
    }
    
    
    
    
     public static ResultSet consultarProfesor(String nit){
        ResultSet rs=null;
        try {
           Statement st=Conexion.getConect().createStatement();
                           
         rs=st.executeQuery("select * from profesor where nit_profesor='"+nit+"'");
            
        } catch (SQLException ex) {
            Logger.getLogger(DConsultarProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return rs;
        
    }

   

    

  
        
    
    
    
    
    
}
