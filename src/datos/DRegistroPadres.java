/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.VConsultarPadres;

/**
 *
 * @author dueñes
 */
public class DRegistroPadres {
    
    
    public static void registrarPadres(){
        
        String nit=VConsultarPadres.getTxtidentificacion().getText();
        String nombre=VConsultarPadres.getTxtNombre().getText();
        String direccion=VConsultarPadres.getTxtDireccion().getText();
        String telefono=VConsultarPadres.getTxtTelefono().getText();
        String email=VConsultarPadres.getTxtEmail().getText();
        
        
        
        
        
        
        try {
            
        Statement  st=Conexion.getConect().createStatement();
         
          st.execute("INSERT INTO padres values ('"+nit+"','"+nombre+"','"+direccion+"','"+telefono+"','"+email+"' )");
             JOptionPane.showMessageDialog(null, "ok");
      
            
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DRegistroPadres.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "error en la consulta");
          
           
        }
        
        
        
        
       
          

    
    }
    
    

}
