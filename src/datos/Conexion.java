/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author cata
 */
public class Conexion {
    
        private static Connection conect=null;
        
        public static void conect(){
                
               try {
          Class.forName("com.mysql.jdbc.Driver");
         
      
          
      } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                
      }
      
  
          try {
              Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/cdi","root","1234");
               JOptionPane.showMessageDialog(null, "conectado bd");
             
          conect=conectar;
              
          } catch (SQLException ex) {
              
              Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, " no ha establecido conexion con la  bd");
          
          }
          


        }    

    /**
     * @return the conect
     */
    public static Connection getConect() {
        return conect;
    }

    /**
     * @param aConect the conect to set
     */
    public static void setConect(Connection aConect) {
        conect = aConect;
    }
        
}
    

            
 