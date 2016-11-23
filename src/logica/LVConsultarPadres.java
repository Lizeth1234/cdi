/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import datos.Conexion;
import datos.DConsultarPadres;
import datos.DRegistroPadres;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.VConsultarPadres;
import static vista.VConsultarPadres.TxtDireccion;
import static vista.VConsultarPadres.TxtEmail;
import static vista.VConsultarPadres.TxtNombre;
import static vista.VConsultarPadres.TxtTelefono;
import static vista.VConsultarPadres.tblPadres;
import static vista.VConsultarPadres.txtidentificacion;

/**
 *
 * @author dueñes
 */
public class LVConsultarPadres {
 
    
    public static void logicabtnConsultar(String nit) throws SQLException{
         ResultSet rs;
         
         
       if(nit.equals("0")){
      rs= DConsultarPadres.consultarPadres();
       
       }
       else
       {
         rs= DConsultarPadres.consultarPadres(nit);
       
       }
          
        
       
        
        
        
        DefaultTableModel modelo= new DefaultTableModel();
        VConsultarPadres.getTblPadres().setModel(modelo);
        modelo.addColumn("nit");
        modelo.addColumn("nombre");
        modelo.addColumn("direccion");
        modelo.addColumn("telefono");
        modelo.addColumn("emaail");
    
       
         
                
  
        while (rs.next()){
        
        Object [] fila= new Object[5];
        
       fila[0]=(rs.getString(1));
       fila[1]=(rs.getString(2));
       fila[2]=(rs.getString(3));
       fila[3]=(rs.getString(4));
       fila[4]=(rs.getString(5));
     
       modelo.addRow(fila);
       
           
      
       
        
        
        }
    }

  
  public static void logicabtnlimpiar(){
      
       VConsultarPadres.getTxtidentificacion().setText("0");
       VConsultarPadres.getTxtNombre().setText("");
       VConsultarPadres.getTxtDireccion().setText("");
       VConsultarPadres.getTxtTelefono().setText("");
       VConsultarPadres.getTxtEmail().setText("");
      
   }
  
  
  
  
  
  public static  void Logicabtnactualizar(){

        try {
            
            Statement st= Conexion.getConect().createStatement();
            st.executeUpdate("UPDATE padres SET nit_padre='"+txtidentificacion.getText()+
                    "',nombre='"+TxtNombre.getText()+"',direccion='"+TxtDireccion.getText()+"',telefono='"+TxtTelefono.getText()+"',email='"+TxtEmail.getText()+"' WHERE nit_padre='"+txtidentificacion.getText()+"'   ");
                    
            //st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "datos actualizados");
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DRegistroPadres.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  


}
    public static void logicabtnModificar() {
        
    
  int fila= tblPadres.getSelectedRow();
        if(fila>=0){

            
            txtidentificacion.setText(tblPadres.getValueAt(fila,0).toString());
            TxtNombre.setText(tblPadres.getValueAt(fila,1).toString());
            TxtDireccion.setText(tblPadres.getValueAt(fila,2).toString());
            TxtTelefono.setText(tblPadres.getValueAt(fila,3).toString());
          TxtEmail.setText(tblPadres.getValueAt(fila,4).toString());

        }
        else{
            JOptionPane.showMessageDialog(null, "fila no seleccionada");

        }
  }
    
    
      public static  void LogicabtEliminar(){
          
        int fila=tblPadres.getSelectedRow();
    
         
            
         if(fila>=0){
             
            Statement st;
            
        try {
            st = Conexion.getConect().createStatement();
            st.executeUpdate("DELETE  FROM padres  WHERE nit_padre='"+txtidentificacion.getText()+"'  ");
            
         JOptionPane.showMessageDialog(null, "dato eliminado");
        
        } catch (SQLException ex) {
            Logger.getLogger(LVConsultarPadres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
      }
      }
         public static void logicaLlenarCampos() {
          
           int fila = tblPadres.getSelectedRow();
           
           txtidentificacion.setText((String)tblPadres.getValueAt(fila, 0));
         TxtNombre.setText((String)tblPadres.getValueAt(fila, 1));
          TxtDireccion.setText((String)tblPadres.getValueAt(fila, 2));
           TxtTelefono.setText((String)tblPadres.getValueAt(fila, 3));
          TxtEmail.setText((String)tblPadres.getValueAt(fila, 4));
           
     
     
         }
         
      }


          
      
   
     
     

    
    
    
