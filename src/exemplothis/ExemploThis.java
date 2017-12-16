
package exemplothis;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploThis {

    public static void main(String[] args) {
        Rectangulo rec1=new Rectangulo(8,9);
        System.out.println("rec1 : "+rec1.toString());
        
        Rectangulo rec2=new Rectangulo(6);// <--Coge el CONTRUCTOR THIS Le da el valor 4.
        System.out.println("rec 2 : "+rec2.toString());
        
        Rectangulo rec3=rec1.incrementar();
        rec3.calcularArea();
        rec3.mudarBase();
    }
    
}
