/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.DConsultarEstudiante;
import vista.VGraficaPeso;


import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import vista.VConsultarEstudiante;
import vista.VGraficaAltura;

/**
 *
 * @author Usuario
 */
public class LGraficapeso {
    
    
    public static void logicaBtnGraficar(JRadioButton jRLinea) {
        
        ChartPanel panel;
        JFreeChart  chart=null;
        
        if(jRLinea.isSelected()){
        // ejecuto linea
            
            XYSplineRenderer graficoLinea = new XYSplineRenderer();
            
            
       
           
            XYSeriesCollection dataset = new XYSeriesCollection();
            
            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();
            
            XYSeries serie = new XYSeries("Datos");
                    
            XYPlot plot;
            
             graficoLinea.setSeriesPaint(0, Color.YELLOW);
             
              
           VGraficaPeso.getPanelLinea().removeAll();
       
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
            for(int i=0; i<VGraficaPeso.getjTable1().getRowCount(); i++){
            
                float valor1= Float.parseFloat(String.valueOf(VGraficaPeso.getjTable1().getValueAt(i, 0)));
                float valor2= Float.parseFloat(String.valueOf(VGraficaPeso.getjTable1().getValueAt(i, 1)));
               
                
                
                System.out.println("valores  "+valor1+"   "+valor2);
                
                
            serie.add(valor1,valor2);   
          
            
            }
            
           
            dataset.addSeries(serie);
            
           
            
            x.setLabel("MES");
            y.setLabel("peso");
            
            
            plot = new XYPlot(dataset,x,y,graficoLinea);
           
            
         
         NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
    rangeAxis.setRange(10, 15);    
        
            
            chart = new JFreeChart(plot);
            chart.setTitle("grafico");
            
            
            
            
        panel= new ChartPanel(chart);
        panel.setBounds(5, 10, 410, 350);
        
        VGraficaPeso.getPanelLinea().add(panel);
        VGraficaPeso.getPanelLinea().repaint();
      
        }
        
    
    }
    
        }
    


   
    
     
        
