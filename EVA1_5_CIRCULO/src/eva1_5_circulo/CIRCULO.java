
package eva1_5_circulo;


public class CIRCULO {
        private double radio;
        private double area;
        private double perimetro;
        

    public CIRCULO(double radio1){
        radio=radio1;
        

    }
    
    public CIRCULO(){
        area = 0;
        perimetro = 0;
        radio = 0;
        
}
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio1) {
        radio = radio1;
    }

    public double getArea() {
        area  = (Math.PI)*(Math.pow(radio, 2));
        return area;
    }

    public double getPerimetro() {
        perimetro  = 2*(Math.PI*radio);
        return perimetro;
    }

    
   



    
    
    
    
}
