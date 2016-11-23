/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import vista.VGraficaAltura;

import vista.VGraficaPeso;

/**
 *
 * @author lizeth
 */
public class LVgraficaPeso {
    
    
   
    
    public static ResultSet consultarPeso(String cod){
        ResultSet rs=null;
        try {
            
            Statement st=Conexion.getConect().createStatement();
           
                           
         rs=st.executeQuery("select mes,peso from peso_estud where codigo_estudiante='"+cod+"'");
         
          
         
        } catch (SQLException ex) {
            Logger.getLogger(LVgraficaPeso.class.getName()).log(Level.SEVERE, null, ex);
            
        }
      
        
        return rs;
    
    
    
       
    }
    
    public static void logicabtnbuscar(String cod) {
        ResultSet rs = null;
        
        
                
        if(cod.equals("0")){
         JOptionPane.showMessageDialog(null, "inserte datos a buscar");
       
       }
       else
       {
            
           rs= LVgraficaPeso.consultarPeso(cod);
       
       }
        
        DefaultTableModel modelo=new DefaultTableModel();
        VGraficaPeso.Tpeso.setModel(modelo);
        modelo.addColumn("mes");
        modelo.addColumn("peso");
        
        
        try {
            while (rs.next()){
                
                Object [] fila= new Object[2];
                
                
                    fila[0]=(rs.getString(1));
                    fila[1]=(rs.getString(2));
                   
                    modelo.addRow(fila);
                    
                    
                
                
            }   } catch (SQLException ex) {
            Logger.getLogger(LVgraficaPeso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    



   
    }

   
    
    
}
