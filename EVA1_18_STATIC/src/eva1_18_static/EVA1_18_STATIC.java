/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_static;

/**
 *
 * @author invitado
 */
public class EVA1_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //static: cuando es estatico se inicia al iniciar el programa
        //y lo que no es estatico necesita un objeto
        Prueba obj = new Prueba();
        obj.mensaje();
        Prueba.mensajeEstatico();
        System.out.println("PI " + Math.PI);
        
        
    }
    
}

class Prueba{
    public void mensaje(){//Se puede usar solo al crear objetos
        System.out.println("Holaa!!");
    }
    
    public static void mensajeEstatico(){//Se puede usar directamente de la clase
        System.out.println("Holaa (Estatico)");
    }
}

class Otra{
    
}
