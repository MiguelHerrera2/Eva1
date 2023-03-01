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
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA; 
    
    public void prueba(){
        
        //Todas estas clases estan en paquete 1
        //Mismo paquete, public, default son visibles
        
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.defaultC;
        //objC.publicC;
        
        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;
        
        //Clases del paquete 2 
        //TODO LO QUE SEA DEFAULT ES AHORA INVISIBLE
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClñaseF es deafult, y por lo tanto no es visible desde la claseA u  otro paquete
        //ClaseF objF = new ClaseF();
    }
    
    
}

class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB; 
    
    public void prueba(){
        
        //Todas estas clases estan en paquete 1
        //Mismo paquete, public, default son visibles
        
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.defaultC;
        //objC.publicC;
        
        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;
        
        //Clases del paquete 2 
        //TODO LO QUE SEA DEFAULT ES AHORA INVISIBLE
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClñaseF es deafult, y por lo tanto no es visible desde la claseA u  otro paquete
        //ClaseF objF = new ClaseF();
    }
}
