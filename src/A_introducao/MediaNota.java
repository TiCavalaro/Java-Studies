/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introducao;


public class MediaNota {
    //vamos criar as variáveis de classe/atributos
    //variáveis globais
    private double n1, n2, n3, p1, p2, p3, media;
    
    //criando um método para calcular
    public double calculaMedia(double n1, double n2, double n3, double p1, double p2, double p3){
        
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        
        //agora criamos a fórmula para calcular
        this.media = (n1*p1 + n2*p2 + n3*p3) / 10;
        
        
        
        // retornaremos o valor armazenado na variável global media
        return this.media;
    }
    
    
}
