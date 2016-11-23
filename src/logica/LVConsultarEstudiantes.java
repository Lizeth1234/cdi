/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import datos.Conexion;
import java.sql.ResultSet;
import datos.DConsultarEstudiante;
import datos.DRegistroEstudiante;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.VConsultarEstudiante;
import static vista.VConsultarEstudiante.cbxCategoria;
import static vista.VConsultarEstudiante.cbxGenero;
import static vista.VConsultarEstudiante.cbxSede;
import static vista.VConsultarEstudiante.jdcFechaNacimiento;
import static vista.VConsultarEstudiante.tblEstudiantes;
import static vista.VConsultarEstudiante.txtApellidos;
import static vista.VConsultarEstudiante.txtCode;
import static vista.VConsultarEstudiante.txtDireccion;
import static vista.VConsultarEstudiante.txtNitpa;
import static vista.VConsultarEstudiante.txtNombre;
import static vista.VConsultarEstudiante.txtRegistroCivil;
import static vista.VConsultarEstudiante.txtTelefono;
import static vista.VConsultarEstudiante.txtValorMatricula;
import util.Utilidades;


/**
 *
 * @author dueñes
 */
public class LVConsultarEstudiantes {
    
    public static void logicabtnConsultar(String codigoEstudiante) {
        ResultSet rs = null;
        
        if(codigoEstudiante.equals("0")){
      rs= DConsultarEstudiante.consultarEstudiante();
       
       }
       else
       {
         rs= DConsultarEstudiante.consultarEstudiante(codigoEstudiante);
       
       }
        
        DefaultTableModel modelo=new DefaultTableModel();
        VConsultarEstudiante.getTblEstudiantes().setModel(modelo);
        modelo.addColumn("codigoEstudiante");
        modelo.addColumn("nombre");
        modelo.addColumn("apellidos");
        modelo.addColumn("fechaNacimiento");
        modelo.addColumn("genero");
        modelo.addColumn("categoria");
        modelo.addColumn("sede");
        modelo.addColumn("registroCivil");
        modelo.addColumn("direccion");
        modelo.addColumn("telefono");
        modelo.addColumn("valorMatricula");
         modelo.addColumn("nitPadre");
        modelo.addColumn("GENERO");
        modelo.addColumn("CATEGORIA");
        modelo.addColumn("SEDE");
        
        try {
            while (rs.next()){
                
                Object [] fila= new Object[15];
                
                
                    fila[0]=(rs.getString(1));
                    fila[1]=(rs.getString(2));
                    fila[2]=(rs.getString(3));
                    fila[3]=(rs.getString(4));
                    fila[4]=(rs.getString(5));
                    fila[5]=(rs.getString(6));
                    fila[6]=(rs.getString(7));
                    fila[7]=(rs.getString(8));
                    fila[8]=(rs.getString(9));
                    fila[9]=(rs.getString(10));
                    fila[10]=(rs.getString(11));
                    fila[11]=(rs.getString(12));
                    fila[12]=(rs.getString(13));
                    fila[13]=(rs.getString(14));
                    fila[14]=(rs.getString(15));
                    modelo.addRow(fila);
                    
                    
                
                
            }   } catch (SQLException ex) {
            Logger.getLogger(LVConsultarEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    



   
    }
    
    public static void logicabtnModificar() {
        
    
    
            int fila= VConsultarEstudiante.getTblEstudiantes().getSelectedRow();
        if(fila>=0){

            VConsultarEstudiante.getTxtCode().setText(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila,0).toString());
            VConsultarEstudiante.getTxtNombre().setText(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila,1).toString());
            VConsultarEstudiante.getTxtApellidos().setText(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila,2).toString());
            String fecha=(String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 3);
            
            System.out.println("string"+fecha);
            Date fechad=util.Utilidades.ponerFecha(fecha);
         
            System.out.println("esta es en date ="+fechad);
           
           
            jdcFechaNacimiento.setDate(util.Utilidades.ponerFecha(fecha));
           
            int codGe= Integer.parseInt(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 4).toString());
            cbxGenero.setSelectedIndex(codGe);
            
            int codCate=Integer.parseInt(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 5).toString());
            cbxCategoria.setSelectedIndex(codCate);      
            
            int codSed=Integer.parseInt(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 6).toString());
            cbxSede.setSelectedIndex(codSed);
            
            VConsultarEstudiante.getTxtRegistroCivil().setText(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila,7).toString());
            VConsultarEstudiante.getTxtDireccion().setText(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila,8).toString());
            VConsultarEstudiante.getTxtTelefono().setText(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila,9).toString());
            VConsultarEstudiante.getTxtValorMatricula().setText(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila,10).toString());
            VConsultarEstudiante.getTxtNitpa().setText(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 11).toString());
        
            
        
          
                    
                    
        }  
                    
    }    
   
  
    
    
     public static void logicabtnlimpiar(){
      
       VConsultarEstudiante.getTxtCode().setText("");
       VConsultarEstudiante.getTxtNombre().setText("");
       VConsultarEstudiante.getTxtApellidos().setText("");
       VConsultarEstudiante.jdcFechaNacimiento.setDate(null);
       VConsultarEstudiante.cbxGenero.setSelectedIndex(0);
       VConsultarEstudiante.cbxCategoria.setSelectedIndex(0);
       VConsultarEstudiante.cbxSede.setSelectedIndex(0);
       VConsultarEstudiante.getTxtRegistroCivil().setText("" );
       VConsultarEstudiante.getTxtDireccion().setText("");
       VConsultarEstudiante.getTxtTelefono().setText("");
       VConsultarEstudiante.getTxtValorMatricula().setText("");
       VConsultarEstudiante.getTxtNitpa().setText("");
      
       
       
       
       
       
     }
     
     
      public static void logicaLlenarCampos() {
          
           int fila = VConsultarEstudiante.getTblEstudiantes().getSelectedRow();
           VConsultarEstudiante.getTxtCode().setText((String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 0));
           VConsultarEstudiante.getTxtNombre().setText((String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 1));
           VConsultarEstudiante.getTxtApellidos().setText((String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 2));
         
         String fecha=(String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 3);
           jdcFechaNacimiento.setDate(util.Utilidades.ponerFecha(fecha));
           
            int codGe= Integer.parseInt(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 4).toString());
            cbxGenero.setSelectedIndex(codGe);
            
            int codCate=Integer.parseInt(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 5).toString());
            cbxCategoria.setSelectedIndex(codCate);      
            
            int codSed=Integer.parseInt(VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 6).toString());
            cbxSede.setSelectedIndex(codSed);
                    
                   VConsultarEstudiante.getTxtRegistroCivil().setText((String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 7));
                     VConsultarEstudiante.getTxtDireccion().setText((String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 8));
                         VConsultarEstudiante.getTxtTelefono().setText((String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 9));
                           VConsultarEstudiante.getTxtValorMatricula().setText((String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 10));
                           VConsultarEstudiante.getTxtNitpa().setText((String)VConsultarEstudiante.getTblEstudiantes().getValueAt(fila, 11));
                                  
                           
          
        
    }
      
      
      
       public static  void Logicabtnactualizar(){

        try {
            
            Statement st= Conexion.getConect().createStatement();
            
            st.executeUpdate("UPDATE estudiante SET codigo_estudiante='"+VConsultarEstudiante.getTxtCode().getText()+"',nombre='"
                    +VConsultarEstudiante.getTxtNombre().getText()+"',apellido='"+VConsultarEstudiante.getTxtApellidos().getText()+"',fecha_nacimiento='"+Utilidades.convertirFechasAString(jdcFechaNacimiento.getDate())+"',codigo_genero='"+cbxGenero.getSelectedIndex()+"'"
                    + ",codigo_categoria='"+cbxCategoria.getSelectedIndex()+"',codigo_sede='"+cbxSede.getSelectedIndex()+"',numero_registro_civil='"+VConsultarEstudiante.getTxtRegistroCivil().getText()+"',direccion='"+VConsultarEstudiante.getTxtDireccion().getText()+"'"
                    + ",telefono='"+VConsultarEstudiante.getTxtTelefono().getText()+"',valor_matricula='"+VConsultarEstudiante.getTxtValorMatricula().getText()+"',nit_padre='"+VConsultarEstudiante.getTxtNitpa().getText()+"'  WHERE codigo_estudiante='"+VConsultarEstudiante.getTxtCode().getText()+"'   ");
                    
                 
            JOptionPane.showMessageDialog(null, "datos actualizados");
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DRegistroEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
  

       }
       
        public static  void LogicabtEliminar(){
          
        int fila=VConsultarEstudiante.getTblEstudiantes().getSelectedRow();
    
         
            
         if(fila>=0){
             
            Statement st;
            
        try {
            st = Conexion.getConect().createStatement();
            st.executeUpdate("DELETE  FROM estudiante  WHERE codigo_estudiante='"+VConsultarEstudiante.getTxtCode().getText()+"'  ");
            
         JOptionPane.showMessageDialog(null, "dato eliminado");
        
        } catch (SQLException ex) {
            Logger.getLogger(LVConsultarEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
       
       
       
       

    

    
        
        }
}
        
        
}