
package exemplothis;

/**
 *
 * @author dfernandezguerreiro
 */
public class Rectangulo {
    private float base, altura, area;
    
    public Rectangulo(){
        
    }
    public Rectangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    
    // Chamamos ao constructor con this
    public Rectangulo(float b){
        this(b,4);
    }
    
    
    public float getBase(){
        return base;
    }
    public void setBase(float base){
        this.base=base;
    }
    
    @Override
    public String toString(){
        return "base "+base+" , altura "+altura;
    }
    public Rectangulo incrementar(){
        base++;
        altura+=2; // altura=altura+2;
        return this;
    }
    public void calcularArea(){
        float area=base*altura;
        System.out.println("Area = "+area);
    }
    public Rectangulo mudarBase(){// Para devolver referencias do propio obxeto.
        base=15;
        return this;
    }
    
}
