/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_califas;

/**
 *
 * @author invitado
 */
public class EVA1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String result;
        result=calif(85);
        System.out.println("Tu calificacion es: " + calif(100));
        System.out.println("Tu calificacion es: " + result);
        
    }
    public static String calif(int cali){
        String letra = null;
        
        if ((cali>=91) && (cali<=100)){
           letra = "A";
        }else if((cali<=90) && (cali>=81)){
            letra="B";
        } else if((cali<=80) && (cali>=71)){
            letra="C";
        }else if((cali>=0) && (cali<=70)){
            letra="D";
        }
        return letra;
    }
}
