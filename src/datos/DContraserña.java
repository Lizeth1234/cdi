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
import javax.swing.JOptionPane;
import vista.VRecuperarContraseña;

/**
 *
 * @author cata
 */
public class DContraserña {
    
     public static void buscarPregunta(String usu){
    
        try {
            Statement st = Conexion.getConect().createStatement();
            
             ResultSet rs = st.executeQuery("select id_pregunta from usuario where usuario = '"+usu+"' ");
            while (rs.next()){
                
                int ind= Integer.parseInt(rs.getString("id_pregunta"));
                
                VRecuperarContraseña.getCbxPregunta().setSelectedIndex(ind);
                
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(DUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void recuperarContaseña(String usu, String resp){
               
        try {
            Statement st = Conexion.getConect().createStatement();
            
             ResultSet rs = st.executeQuery("select contraseña from usuario  where usuario= '"+usu+"' and respuesta = '"+resp+"' ");
            while (rs.next()){
                

                VRecuperarContraseña.getLblCoctraseña().setText(logica.LEncriptar.Desencriptar(rs.getString("contraseña")));
                   
                 
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(DUsuario.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Error, verifique su respuesta");
        }

    }
    
    
    
    
    public static void cambiarContraseña(String usu, String ctr){
    
        try {
            Statement st= Conexion.getConect().createStatement();
            
            st.execute("update usuario set contraseña = '"+ctr+"' where usuario = '"+usu+"' ");
            JOptionPane.showMessageDialog(null, "Cambio exitoso");
            
        } catch (SQLException ex) {
            Logger.getLogger(DUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo cambiar la contraseña");
        }
    }
    
      
    
         
    
}
