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
public class EV1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        autoCal auto1 = new autoCal();{
        auto1.setMarca("Chrysler");
        auto1.setModelo("PT cruiser GT");
        auto1.setPlaca("1234sd");
        auto1.setAño(2002);
        auto1.setDueño("Miguel Herrera");
        System.out.println("Datos automovil:");
        System.out.println("Dueño: " + auto1.getDueño());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Placa: " + auto1.getPlaca());
        System.out.println("Adeudo: " + auto1.getAdeudo());
        
    }
    }
  
}
