
package A_introducao4;


public class MediaNota {
    
    double n1, n2, media;
    
    public double calculaMedia(double n1, double n2){
        
        this.n1 = n1;
        this.n2 = n2;
        
        this.media = (n1 + n2) / 2;
        
        return this.media;
    }
    
}
