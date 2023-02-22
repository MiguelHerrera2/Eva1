/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_return;

/**
 *
 * @author invitado
 */
public class EVA1_10_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        square(10);//Llamada a funcion, pero sin hacer nada con resultado
        int resu;
        resu = square(3);//Llamada a funcion, almacenando resultado
        System.out.println(resu);
        System.out.println(square(5));//Llamada a funcion, enviando el resultado a println
    }
    public static int square(int num){
        return num * num;
    }
    
}
