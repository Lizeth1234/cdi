/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author cata
 */
public class LEncriptar {
    
    private static char[]abcdario ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
    private static char[]abcloco = {'1','%','&','@','q','w','e','r','t','y','u','i','o','p','#','l','3','6','9','-','*','/','9','5','<','|','¡','°',',','.',';',':','=','Z','X','$','E'};
    
    public static String Encriptar (String palabra){
    
        String salida="";
        
        char vectorpalabra[]=palabra.toCharArray();
    
        for (int i=0;i<vectorpalabra.length;i++){
    
            for (int j=0;j<abcdario.length;j++){

                if (vectorpalabra[i]==abcdario[j]){
    
                salida=salida+abcloco[j];{
                }
            }
        }
    }
    return salida;     
    }
    
    public static String Desencriptar (String palabra){
    String salida="";
    
    char vectorpalabra[]=palabra.toCharArray();
    
    for (int i=0;i<vectorpalabra.length;i++){
        
        for (int j=0;j<abcloco.length;j++){
            
            if (vectorpalabra[i]==abcloco[j]){
                
                salida=salida+abcdario[j];{
                }
            }
        }
    }
    
    return salida;
    }
    }

