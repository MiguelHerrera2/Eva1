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
public class cuentaBancaria {
    
    private String nombreCliente;
    private double saldo;
    private String cuenta;
    
    //CUENTA
    //REGLAS
    //MODIFICADOR DE ACCESO, NOMBRE DE LA CUENTA (ARGUMENTOS)
    
    public cuentaBancaria(){
        cuenta = "---";
        saldo = 0.0;
        nombreCliente = "---";
    }   
    public cuentaBancaria(String nCuenta, double cant, String nCliente){
        nombreCliente = nCliente;
        saldo = cant;
        cuenta = nCuenta;
    }
    
    //metodos get
    public String getnombreCliente(){
        return nombreCliente;
    }
    
     public double getsaldo(){
        return saldo;
    }
     
      public String getcuenta(){
        return cuenta;
    }
      
    //metodo set
    
    public void setnombreCliente(String valor){
        nombreCliente = valor;
    }
    
     public void setsaldo(double valor2){
        saldo = valor2;
    }
     
      public void setcuenta(String valor3){
        cuenta = valor3;
    } 
 



}

