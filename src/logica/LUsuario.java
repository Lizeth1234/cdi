/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import static vista.VIngresarUsuarios.TxtUsuario;
import static vista.VIngresarUsuarios.TxtNombres;
import static vista.VIngresarUsuarios.TxtContraseña;
import static vista.VIngresarUsuarios.CmbPreguntas;
import static vista.VIngresarUsuarios.TxtRespuesta;

/**
 *
 * @author cata
 */
public class LUsuario {
    
    public static void LimpiarCampos(){
       vista.VIngresarUsuarios.getTxtUsuario().setText("");
       vista.VIngresarUsuarios.getTxtNombres().setText("");
       vista.VIngresarUsuarios.getTxtContraseña().setText("");
       vista.VIngresarUsuarios.getCmbPreguntas().setSelectedIndex(0);
       vista.VIngresarUsuarios.getTxtRespuesta().setText("");
    }
    
}
