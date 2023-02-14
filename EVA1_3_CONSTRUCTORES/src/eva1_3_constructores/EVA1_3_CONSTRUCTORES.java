/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_constructores;

/**
 *
 * @author invitado
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cuentaBancaria cuenta1 = new cuentaBancaria("123345",300, "Carlos Slim");{
            /*cuenta1.setnombreCliente("Migue Herrera");
            cuenta1.setssaldo(2500);
            cuenta1.setcuenta("22550318");
        */
        
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta1.getnombreCliente());
        System.out.println(cuenta1.getsaldo());
        System.out.println(cuenta1.getcuenta());
       
        
        cuentaBancaria cuenta2 = new cuentaBancaria();
        
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta2.getnombreCliente());
        System.out.println(cuenta2.getsaldo());
        System.out.println(cuenta2.getcuenta());
        
        
        cuentaBancaria cuenta3 = new cuentaBancaria("22550318", 200, "Miguel Herrera");
        
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta3.getnombreCliente());
        System.out.println(cuenta3.getsaldo());
        System.out.println(cuenta3.getcuenta());
    }
    }
    
}
