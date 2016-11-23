/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package softwcdi;

import datos.Conexion;
import vista.ManejadorDePantalla;

/**
 *
 * @author CLAUDIA
 */
public class Softwcdi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion.conect();
        ManejadorDePantalla.AbrirLogin();
    }
}
