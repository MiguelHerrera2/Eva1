/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author Miguel
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Area de circulo de 5cm: " + Area(5.0));
        System.out.println("Area de triangulo de 8cm de base y 10cm de altura: " + Area(8.0, 10.0));
        System.out.println("Area de triangulo de 10cm de base menor, 19cm de base mayor y altura de 5cm: " + Area(5.0, 10.0, 19.0));
    }
    public static double Area(double radio){
        return Math.PI * (radio * radio);
    }
    public static double Area(double base, double altura){
        return (base * altura) / 2;
    }
    public static double Area(double altura, double baseMen, double baseMay){
        return (altura * (baseMen + baseMay)) / 2;
    }
    
}
