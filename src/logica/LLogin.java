/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import datos.Conexion;
import datos.DUsuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.ManejadorDePantalla;



/**
 *
 * @author cata
 */
public class LLogin {
    
    public static int cont=0;

    public static void ValidarUsuario (String usu, String ctr){
        
        try {
            Statement st = Conexion.getConect().createStatement();
            
             ResultSet rs= st.executeQuery("select * from usuario where usuario= '"+usu+"' and contraseña ='"+ctr+"'");
            while (rs.next()){
                
                if (rs.getString("usuario").equals(usu) &&  rs.getString("contraseña").equals(ctr) ){
                    
                    JOptionPane.showMessageDialog(null, "B I E N V E N I D O");
                    ManejadorDePantalla.CerrarLogin();
              
                }
                else {
                    JOptionPane.showMessageDialog(null, "contraseña incorrecta, intente otra vez");   
                }    
            } 
        } 
        catch (SQLException ex) {
            Logger.getLogger(DUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ( cont == 3){
            System.exit(0);
        }
        else{
            cont =cont+1;
        }
    }    
}