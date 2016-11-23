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
public class DConsultarEstudiante {
    
     public static ResultSet consultarEstudiante(){
        ResultSet rs=null;
        try {
            Statement st=Conexion.getConect().createStatement();
                           
         rs=st.executeQuery("select estudiante.codigo_estudiante,estudiante.nombre,estudiante.apellido,estudiante.fecha_nacimiento,estudiante.codigo_genero, estudiante.codigo_categoria,estudiante.codigo_sede, estudiante.numero_registro_civil,estudiante.direccion,estudiante.telefono,estudiante.valor_matricula,estudiante.nit_padre, genero.nombre_genero , categoria.nombre_categoria, sede.nombre_sede  from estudiante,genero,categoria,sede");
         
          
         
        } catch (SQLException ex) {
            Logger.getLogger(DConsultarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        return rs;
        
   
        
    }
    
     
    
    
    
     public static ResultSet consultarEstudiante(String codigoEstudiante){
        ResultSet rs=null;
       
        try {
           Statement st=Conexion.getConect().createStatement();
                           
         rs=st.executeQuery("select * from estudiante where codigo_estudiante='"+codigoEstudiante+"'");
            
        } catch (SQLException ex) {
            Logger.getLogger(DConsultarEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return rs;
        
    }

     
     
     
     
}
    
    
    

    
    
    
    
    
    

