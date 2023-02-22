/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ev1_6_automovil;

/**
 *
 * @author invitado
 */
public class autoCal {
    private String marca = "---";
    private String modelo = "---";
    private String placa = "---";
    private int año=0;
    private String dueño = "---";
    private int adeudo;
    

    
    public int getAdeudo(){
         if(año<=2000){
           adeudo = 1500;
       }else{
           if(año<=2005 ){
            adeudo=2000;   
           }else{
               if(año<=2010){
                   adeudo=2500;
               }else{
                   if(año<=2015){
                      adeudo=3000; 
                   }else{
                       if(año<=2023){
                           adeudo=4000;
                       }
                   }
               }
           }
       } 
        return adeudo;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca1) {
        marca = marca1;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo1) {
        modelo = modelo1;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa1) {
        placa = placa1;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año1) {
        año = año1;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño1) {
        dueño = dueño1;
    }
    
    
    
    
}
