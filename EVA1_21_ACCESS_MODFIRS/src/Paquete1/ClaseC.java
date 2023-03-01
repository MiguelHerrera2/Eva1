/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author invitado
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC; 
    
    public void Prueba(){
        //Clase del mismo paquete
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        //Clase de Paquete2
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF es de otro paquete y es default,
        //es invisible 
        //ClaseF objF = new ClaseF();
    }
    
}

class ClaseD {
    public int publicD;
    int defaultD;
    private int privateD; 
}

