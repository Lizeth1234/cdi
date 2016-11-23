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

/**
 *
 * @author cata
 */
public class DUsuario {
    
    public static void InsertarUsuario(String usr, String nom, String ctr, String preg, String resp){

        try {
            Statement st= Conexion.getConect().createStatement();
            
            st.execute("insert into usuario values( '"+usr+"','"+nom+"','"+ctr+"','"+preg+"','"+resp+"' )");
            JOptionPane.showMessageDialog(null, "Usuario registrado");
            
        } catch (SQLException ex) {
            Logger.getLogger(DUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo registrar el usuario");
        }
    }
    
     public static void eliminarUsuario(String usu){
    
        try {
            Statement st= Conexion.getConect().createStatement();
            
            st.execute("delete from usuario where usuario = '"+usu+"' ");
            JOptionPane.showMessageDialog(null, "Usuario eliminado");
            
        } catch (SQLException ex) {
            Logger.getLogger(DUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
    }
}