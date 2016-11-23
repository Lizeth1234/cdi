/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author cata
 */
public class ManejadorDePantalla {
    
    
    private static VLogin PantallaLogin;
   
    private static VIngresarUsuarios PantallaIngresarUsuario;
    private static VRecuperarContraseña PantallaRecuperarContraseña;
    private static VCambiarrContraseña PantallaCambiarContraseña;
    private static VInicio PantallaInicio;
   
 

   
    private static VConsultarEstudiante PantallaConsultaEstudiante;
    private static VConsultarPadres PantallaConsultarPadres;
    private static VConsultarProfesor pantallaConsultarProfesor;
private static VGraficaPeso PantallagraficaPeso;
private static VGraficaAltura PantallagraficaAltura;
private static VGraficar PantallaGraficos;

   public static void abrirVGraficar() {
    
        setPantallaGraficos(new VGraficar());
        getPantallaGraficos().setVisible(true);
        getPantallaGraficos().setLocationRelativeTo(null);
     }
     
       public static void cerrarVGraficar() {
        
         getPantallaGraficos().setVisible(false);
        setPantallaGraficos(null);
        
    }
       
      public static void abrirVGraficaPeso() {
    
        setPantallagraficaPeso(new VGraficaPeso());
        getPantallagraficaPeso().setVisible(true);
        getPantallagraficaPeso().setLocationRelativeTo(null);
     }
     
       public static void cerrarVGraficaPeso() {
        
         getPantallagraficaPeso().setVisible(false);
        setPantallagraficaPeso(null);
        
    }
       
       public static void abrirVGraficaAltura() {
    
        setPantallagraficaAltura(new VGraficaAltura());
        getPantallagraficaAltura().setVisible(true);
        getPantallagraficaAltura().setLocationRelativeTo(null);
     }
     
       public static void cerrarVGraficaAltura() {
        
         getPantallagraficaAltura().setVisible(false);
        setPantallagraficaAltura(null);
        
    }
       
 public static void abrirVInicio() {
    
        setPantallaInicio(new VInicio());
        getPantallaInicio().setVisible(true);
        getPantallaInicio().setLocationRelativeTo(null);
      
        
    }
 public static void cerrarVInicio() {
        
        getPantallaInicio().setVisible(false);
        setPantallaInicio(null);
        
    }
 
  
    
    
    
    
  

      
      public static void abrirconsultarPadres() {
    
        setPantallaConsultarPadres(new VConsultarPadres());
        getPantallaConsultarPadres().setVisible(true);
          getPantallaConsultarPadres().setLocationRelativeTo(null);
        
    }
      public static void cerrarVConsultarPadres() {
        
        getPantallaConsultarPadres().setVisible(false);
        setPantallaConsultarPadres(null);
        
    }
       
       public static void abrirVConsultarEstudiante() {
    
        setPantallaConsultaEstudiante(new VConsultarEstudiante());
        getPantallaConsultaEstudiante().setVisible(true);
          getPantallaConsultaEstudiante().setLocationRelativeTo(null);
        
    }
      public static void cerrarVConsultarEstudiante() {
        
        getPantallaConsultaEstudiante().setVisible(false);
        setPantallaConsultaEstudiante(null);
        
    }
      
      public static void abrirVConsultarProfesor() {
    
        setPantallaConsultarProfesor(new VConsultarProfesor());
        getPantallaConsultarProfesor().setVisible(true);
          getPantallaConsultarProfesor().setLocationRelativeTo(null);
        
    }
      public static void cerrarVConsultarProfesor() {
        
        getPantallaConsultarProfesor().setVisible(false);
          setPantallaConsultarProfesor(null);
        
    }
      
    
    
    public static void AbrirLogin(){
        setPantallaLogin(new VLogin());
        getPantallaLogin().setVisible(true);
        getPantallaLogin().setLocationRelativeTo(null);
    }
    
    public static void CerrarLogin(){
        getPantallaLogin().setVisible(false);
        setPantallaLogin(null);  
    }
    
    
  
    
    
    public static void AbrirPantallaIngresarUsuario(){
        setPantallaIngresarUsuario(new VIngresarUsuarios());
        getPantallaIngresarUsuario().setVisible(true);
        getPantallaIngresarUsuario().setLocationRelativeTo(null);
    }
    
    public static void CerrarPantallaIngresarUsuario(){
        getPantallaIngresarUsuario().setVisible(false);
        setPantallaIngresarUsuario(null);
    }
    
    
    public static void AbrirPantallaRecuperarContraseña(){
        setPantallaRecuperarContraseña(new VRecuperarContraseña());
        getPantallaRecuperarContraseña().setVisible(true);
        getPantallaRecuperarContraseña().setLocationRelativeTo(null);
    
    }
    
    public static void CerrrarPantallaRecuperarContraseña(){
        getPantallaRecuperarContraseña().setVisible(false);
        setPantallaRecuperarContraseña(null);
    
    }
    
  
    public static void AbrirPantallaCambiarContraseña(){
        setPantallaCambiarContraseña(new VCambiarrContraseña());
        getPantallaCambiarContraseña().setVisible(true);
        getPantallaCambiarContraseña().setLocationRelativeTo(null);
    
    }
    
    public static void CerrrarPantallaCambiarContraseña(){
        getPantallaCambiarContraseña().setVisible(false);
        setPantallaCambiarContraseña(null);
    
    }

    /**
     * @return the PantallaLogin
     */
    public static VLogin getPantallaLogin() {
        return PantallaLogin;
    }

    /**
     * @param aPantallaLogin the PantallaLogin to set
     */
    public static void setPantallaLogin(VLogin aPantallaLogin) {
        PantallaLogin = aPantallaLogin;
    }

  

    /**
     * @return the PantallaIngresarUsuario
     */
    public static VIngresarUsuarios getPantallaIngresarUsuario() {
        return PantallaIngresarUsuario;
    }

    /**
     * @param aPantallaIngresarUsuario the PantallaIngresarUsuario to set
     */
    public static void setPantallaIngresarUsuario(VIngresarUsuarios aPantallaIngresarUsuario) {
        PantallaIngresarUsuario = aPantallaIngresarUsuario;
    }

    /**
     * @return the PantallaRecuperarContraseña
     */
    public static VRecuperarContraseña getPantallaRecuperarContraseña() {
        return PantallaRecuperarContraseña;
    }

    /**
     * @param aPantallaRecuperarContraseña the PantallaRecuperarContraseña to set
     */
    public static void setPantallaRecuperarContraseña(VRecuperarContraseña aPantallaRecuperarContraseña) {
        PantallaRecuperarContraseña = aPantallaRecuperarContraseña;
    }

    /**
     * @return the PantallaCambiarContraseña
     */
    public static VCambiarrContraseña getPantallaCambiarContraseña() {
        return PantallaCambiarContraseña;
    }

    /**
     * @param aPantallaCambiarContraseña the PantallaCambiarContraseña to set
     */
    public static void setPantallaCambiarContraseña(VCambiarrContraseña aPantallaCambiarContraseña) {
        PantallaCambiarContraseña = aPantallaCambiarContraseña;
    }

    /**
     * @return the PantallaInicio
     */
    public static VInicio getPantallaInicio() {
        return PantallaInicio;
    }

    /**
     * @param aPantallaInicio the PantallaInicio to set
     */
    public static void setPantallaInicio(VInicio aPantallaInicio) {
        PantallaInicio = aPantallaInicio;
    }

   
    /**
     * @return the PantallaConsultaEstudiante
     */
    public static VConsultarEstudiante getPantallaConsultaEstudiante() {
        return PantallaConsultaEstudiante;
    }

    /**
     * @param aPantallaConsultaEstudiante the PantallaConsultaEstudiante to set
     */
    public static void setPantallaConsultaEstudiante(VConsultarEstudiante aPantallaConsultaEstudiante) {
        PantallaConsultaEstudiante = aPantallaConsultaEstudiante;
    }

    /**
     * @return the PantallaConsultarPadres
     */
    public static VConsultarPadres getPantallaConsultarPadres() {
        return PantallaConsultarPadres;
    }

    /**
     * @param aPantallaConsultarPadres the PantallaConsultarPadres to set
     */
    public static void setPantallaConsultarPadres(VConsultarPadres aPantallaConsultarPadres) {
        PantallaConsultarPadres = aPantallaConsultarPadres;
    }

    /**
     * @return the pantallaConsultarProfesor
     */
    public static VConsultarProfesor getPantallaConsultarProfesor() {
        return pantallaConsultarProfesor;
    }

    /**
     * @param aPantallaConsultarProfesor the pantallaConsultarProfesor to set
     */
    public static void setPantallaConsultarProfesor(VConsultarProfesor aPantallaConsultarProfesor) {
        pantallaConsultarProfesor = aPantallaConsultarProfesor;
    }

    /**
     * @return the PantallagraficaPeso
     */
    public static VGraficaPeso getPantallagraficaPeso() {
        return PantallagraficaPeso;
    }

    /**
     * @param aPantallagraficaPeso the PantallagraficaPeso to set
     */
    public static void setPantallagraficaPeso(VGraficaPeso aPantallagraficaPeso) {
        PantallagraficaPeso = aPantallagraficaPeso;
    }

    /**
     * @return the PantallagraficaAltura
     */
    public static VGraficaAltura getPantallagraficaAltura() {
        return PantallagraficaAltura;
    }

    /**
     * @param aPantallagraficaAltura the PantallagraficaAltura to set
     */
    public static void setPantallagraficaAltura(VGraficaAltura aPantallagraficaAltura) {
        PantallagraficaAltura = aPantallagraficaAltura;
    }

    /**
     * @return the PantallaGraficos
     */
    public static VGraficar getPantallaGraficos() {
        return PantallaGraficos;
    }

    /**
     * @param aPantallaGraficos the PantallaGraficos to set
     */
    public static void setPantallaGraficos(VGraficar aPantallaGraficos) {
        PantallaGraficos = aPantallaGraficos;
    }
    
}
