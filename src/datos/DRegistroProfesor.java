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

import vista.VConsultarProfesor;

/**
 *
 * @author dueñes
 */
public class DRegistroProfesor {
    
    public static void registrarProfesor () {
    
    String nit= VConsultarProfesor.getTxtNit().getText();
    int categoria=VConsultarProfesor.CbxCategoria.getSelectedIndex();
   
    String nombre=VConsultarProfesor.getTxtNombre().getText();
    String direccion=VConsultarProfesor.getTxtDireccion().getText();
    String telefono=VConsultarProfesor.getTxtTelefono().getText();
    String email=VConsultarProfesor.getTxtEmail().getText();
    String fax=VConsultarProfesor.getTxtFax().getText();
    
    
    
    
    Statement  st;
        try {
            
            
            st = Conexion.getConect().createStatement();
             st.execute("INSERT INTO profesor values ('"+nit+"','"+categoria+"','"+nombre+"','"+direccion+"','"+telefono+"','"+email+"','"+fax+"' )");
             JOptionPane.showMessageDialog(null, "ok");
             
             
        } catch (SQLException ex) {
            
            Logger.getLogger(DRegistroProfesor.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(null, "error en la consulta");
        }
            
              
    
    
    
    }
    
    
    
    
    
    
    
}
