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
public class Persona {
    //DATOS --> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    //METODOS --> COMPORTAMIENTO DE LA CLASE
    //LEER Y ESCRIBIR LOS ATRIBUTOS DE LA CLASE
    //LEER --> GET
    //ESCRIBIR --> SET
    //MODIFICADOR DE ACCESO, VALOR DE RETORNO, NOMBRE DEL METODO (ARGUMENTOS) (IMPLEMENTACION)
    public String getNombre(){//METODO GET
       
        return nombre;
    }
    public void setNombre(String valor){//METODO SET
        nombre = valor;
    }

    public String getApellido(){//METODO GET
       
        return apellido;
    }
    public void setApellido(String valor){//METODO SET
        apellido = valor;
    }
    public int getEdad(){//METODO GET
       
        return edad;
    }
    public void setEdad(int valor){//METODO SET
        edad = valor;
    }
    public char getGenero(){//METODO GET
       
        return genero;
    }
    public void setGenero(char valor){//METODO SET
        genero = valor;
    
}
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " " + "Años");
        if(genero == 'H'){
        System.out.println("Hombre");
        }else if (genero == 'M'){
            System.out.println("Mujer");
        }else if (genero == 'L'){
            System.out.println("Lesbiana");
        }else{
            System.out.println("Genero no registrado");
        }
    }
}

