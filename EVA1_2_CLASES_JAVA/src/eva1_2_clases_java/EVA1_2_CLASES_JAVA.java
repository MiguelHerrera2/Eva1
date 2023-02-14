/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UN OBJETO
        //INSTANCIACIÓN
        //INSTANCIAR  -->  DAR MEMORIA RAM
        //NOMBRE DE LA CLASE INDENTIFICADOR = new CONSTRUCTOR DE LA
        Persona perso1 = new Persona();//Persona() es el constructor
        /*perso1.nombre = "Miguel";
        perso1.apellido = "Herrera";
        System.out.println(perso1.nombre + " " + perso1.apellido);*/
        perso1.setNombre("Miguel");
        perso1.setApellido("Herrera");
        perso1.setEdad(18);
        perso1.setGenero('H');
        /*System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad() + " " + "años");
        System.out.println(perso1.getGenero());*/
        perso1.imprimirDatos();

    }
    
}
