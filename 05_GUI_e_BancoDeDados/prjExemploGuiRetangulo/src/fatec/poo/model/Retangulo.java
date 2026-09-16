package fatec.poo.model;

/**
 * @author Fatec
 */
public class Retangulo {
    private double altura;
    private double base;
    private String unidadeMedida;
    
    //método construtor
    //tem o mesmo nome da classe
    public Retangulo(String uniMed){
        unidadeMedida = uniMed;
    }
    
    public void setAltura(double a){
        altura = a;
    }  
    
    public double getAltura(){
        return(altura);
    }
    
    public void setBase(double b){
        base = b;
    }  
    
    public double getBase(){
        return(base);
    }
   
    public String getUnidadeMedida(){
        return(unidadeMedida);
    }
    
    public double calcArea(){
        return(altura * base);
    }
    
    public double calcPerimetro(){
        return(2*(altura + base));
    }   
    
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
}
