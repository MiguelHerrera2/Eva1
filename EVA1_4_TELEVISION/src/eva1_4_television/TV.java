/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_4_television;

/**
 *
 * @author invitado
 */
public class TV {
    //ATRIBUTOS: estado
    private boolean encendido;
    private int volumen;
    private int canales;
   //metodos: comportamientos
    //COSNTRUCTOR:
    public TV(){//constructor default 
        encendido = false;//apagado
        volumen = 0;
        canales = 0;
    }
    public void cambiarPower(){
       if(encendido == false){//apagado 
           encendido = true; //encendido
           System.out.println("TELEVISION ENCENDIDA");
       }else{
           encendido = false;
           System.out.println("TELEVISION APAGADA");
       }
    }
    public void subirVolumen(){
        if(encendido == true){
          if(volumen < 100){  
            volumen = volumen + 5;
            System.out.println("volumen = " + volumen);
          }
        }
    }
    public void bajarVolumen(){
        if(encendido == true){
            if( volumen > 0){
            volumen = volumen - 5;
            System.out.println("volumen = " + volumen);
            }
        }
    }
    public void subirCanal(){
       if(encendido==true){ 
         if(canales < 100)   
            canales = canales + 1;
         else
            canales = 0;    
       } 
       System.out.println("Canales = " + canales);
    }
    public void bajarCanal(){
       if(encendido==true){ 
         if(canales > 0)   
            canales = canales - 1;
         else
            canales = 100;    
       } 
       System.out.println("Canales = " + canales);
    
    }
}
