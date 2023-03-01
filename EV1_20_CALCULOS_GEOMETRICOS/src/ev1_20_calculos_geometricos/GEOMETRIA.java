/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ev1_20_calculos_geometricos;

/**
 *
 * @author invitado
 */
public class GEOMETRIA {
    //constates:
    public static final double PI = 3.1416;
    //final: un significado para las clases y un significado para varriables al usarla en variables solo 
    //se puede asignar el valor una vez.
    
    
    //perimetro de un circulo
    public static double perimetroCir(double radio){
        return PI * (radio *2);
    }
    //area de un circulo
    public static double areaCir(double radio){
        return PI * (radio * radio);
    }
    //volumen de una esfera
    public static double volumenEsf(double radio){
        return (4.0 / 3.0) * (PI * (radio * radio * radio));
    }
    
    
}
