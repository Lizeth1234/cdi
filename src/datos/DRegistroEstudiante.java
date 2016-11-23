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
import vista.VConsultarEstudiante;


/**
 *
 * @author dueñes
 */
public class DRegistroEstudiante {
    
    public static void RegistarEstudiante () {
    
    String codigoEstudiante= VConsultarEstudiante.getTxtCode().getText();
    String nombre=VConsultarEstudiante.getTxtNombre().getText();
    String apellidos=VConsultarEstudiante.getTxtApellidos().getText();
    String fnacim =util.Utilidades.convertirFechasAString(VConsultarEstudiante.jdcFechaNacimiento.getDate());
   
    int genero=VConsultarEstudiante.cbxGenero.getSelectedIndex();
    int categoria=VConsultarEstudiante.cbxCategoria.getSelectedIndex();
    int sede=VConsultarEstudiante.cbxSede.getSelectedIndex();
    String registroCivil=VConsultarEstudiante.getTxtRegistroCivil().getText();
    String direccion=VConsultarEstudiante.getTxtDireccion().getText();
    String telefono=VConsultarEstudiante.getTxtTelefono().getText();
    String valorMatricula=VConsultarEstudiante.getTxtValorMatricula().getText();
    
    
    
        try {
            
            Statement  st=Conexion.getConect().createStatement();
            
               st.execute("INSERT INTO Estudiante values ('"+codigoEstudiante+"','"+nombre+"','"+apellidos+"','"+fnacim+"','"+genero+"','"+categoria+"','"+sede+"','"+registroCivil+"','"+direccion+"','"+telefono+"','"+valorMatricula+"' )");
             JOptionPane.showMessageDialog(null, "registro exitoso!!");
      
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DRegistroEstudiante.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, "error en el registro");
        }    
        
    
   

  
}
}
