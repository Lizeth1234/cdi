/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Conexion;
import datos.DConsultarProfesor;
import datos.DRegistroProfesor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import vista.VConsultarProfesor;
import static vista.VConsultarProfesor.CbxCategoria;

import static vista.VConsultarProfesor.TxtDireccion;
import static vista.VConsultarProfesor.TxtEmail;
import static vista.VConsultarProfesor.TxtFax;
import static vista.VConsultarProfesor.TxtTelefono;
import static vista.VConsultarProfesor.tblProfesor;
import static vista.VConsultarProfesor.txtNit;
import static vista.VConsultarProfesor.txtNombre;

/**
 *
 * @author dueñes
 */
public class LVConsultarProfesor {
  
    
    
      public static ResultSet consultarProfesor(String nit){
        ResultSet rs=null;
        
             
        if(nit.equals("0")){
        rs= DConsultarProfesor.consultarProfesor();
       
       }
        
       else
       {
           
         rs= DConsultarProfesor.consultarProfesor(nit);
       
       }
        
        DefaultTableModel modelo=new DefaultTableModel();
        VConsultarProfesor.getTblProfesor().setModel(modelo);
        modelo.addColumn("nit");
        modelo.addColumn("categoria");
        modelo.addColumn("nombre");
        modelo.addColumn("direccion");
        modelo.addColumn("telefono");
        modelo.addColumn("email");
        modelo.addColumn("fax");
        
        
          try {
              while (rs.next()){
                  
                  Object [] fila= new Object[7];
                  
                    fila[0]=(rs.getString(1));
                    fila[1]=(rs.getString(2));
                    fila[2]=(rs.getString(3));
                    fila[3]=(rs.getString(4));
                    fila[4]=(rs.getString(5));
                    fila[5]=(rs.getString(6));
                    fila[6]=(rs.getString(7));
        
                    
                    modelo.addRow(fila);
                  
              } 
              
          } catch (SQLException ex) {
              Logger.getLogger(LVConsultarProfesor.class.getName()).log(Level.SEVERE, null, ex);
          }
          return rs;

}
      public static void logicabtnlimpiar(){
      
       VConsultarProfesor.getTxtNit().setText("0");
       VConsultarProfesor.getCbxCategoria().setSelectedIndex(0);
         VConsultarProfesor.getTxtNombre().setText("");
          VConsultarProfesor.getTxtDireccion().setText("");
           VConsultarProfesor.getTxtTelefono().setText("");
            VConsultarProfesor.getTxtEmail().setText("");
             VConsultarProfesor.getTxtFax().setText("");
      
   }
  
  
  
  
  
  public static  void Logicabtnactualizar(){

        try {
            
            Statement st= Conexion.getConect().createStatement();
            st.executeUpdate("UPDATE profesor SET nit_profesor='"+txtNit.getText()+"',codigo_categoria='"
                    +CbxCategoria.getSelectedIndex()+"',nombre='"+txtNombre.getText()+"',direccion='"+TxtDireccion.getText()+"',telefono='"+TxtTelefono.getText()+"',email='"+TxtEmail.getText()+"',fax='"+TxtFax.getText()+"' WHERE nit_profesor='"+txtNit.getText()+"'   ");
                    
            //st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "datos actualizados");
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DRegistroProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  


}
    public static void logicabtnModificar() {
        
    
  int fila= tblProfesor.getSelectedRow();
        if(fila>=0){

            
            txtNit.setText(tblProfesor.getValueAt(fila,0).toString());
            
           int codCate=Integer.parseInt(tblProfesor.getValueAt(fila, 1).toString());
            CbxCategoria.setSelectedIndex(codCate);      
            
                
           txtNombre.setText(tblProfesor.getValueAt(fila,2).toString());
           TxtDireccion.setText(tblProfesor.getValueAt(fila,3).toString());
           TxtTelefono.setText(tblProfesor.getValueAt(fila,4).toString());
           TxtEmail.setText(tblProfesor.getValueAt(fila,5).toString());
           TxtFax.setText(tblProfesor.getValueAt(fila,6).toString());
        }
        else{
            JOptionPane.showMessageDialog(null, "fila no seleccionada");

        }
  }
    
    
      public static  void LogicabtEliminar(){
          
        int fila=tblProfesor.getSelectedRow();
    
         
            
         if(fila>=0){
             
            Statement st;
            
        try {
            st = Conexion.getConect().createStatement();
            st.executeUpdate("DELETE  FROM profesor  WHERE nit_profesor='"+txtNit.getText()+"' ");
         JOptionPane.showMessageDialog(null, "dato eliminado");
        
        } catch (SQLException ex) {
            Logger.getLogger(LVConsultarPadres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
      }
      }
         public static void logicaLlenarCampos() {
          
           int fila = tblProfesor.getSelectedRow();
           
           txtNit.setText((String)tblProfesor.getValueAt(fila, 0));
           
            int codCate=Integer.parseInt(tblProfesor.getValueAt(fila, 1).toString());
            CbxCategoria.setSelectedIndex(codCate);      
            
                     
           txtNombre.setText((String)tblProfesor.getValueAt(fila, 2));
           TxtDireccion.setText((String)tblProfesor.getValueAt(fila, 3));
           TxtTelefono.setText((String)tblProfesor.getValueAt(fila, 4));
           TxtEmail.setText((String)tblProfesor.getValueAt(fila, 5));
           TxtFax.setText((String)tblProfesor.getValueAt(fila, 6));
     
     
         }
}

 
        

