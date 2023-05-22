/*
VAMOS CRIAR UM PROGRAMA QUE MOSTRE A TABUADA DE UM NÚMERO INTEIRO DIGITADO.
 */
package C_for_ex1;

public class Tabuada {
    private int num1;
    private String saida ="";
    
    public String tabuada(int num1){
        this.num1 = num1;
        
        for(int i=1; i<=10;i++){
            //System.out.println(this.num1 + " x " + i + " = " +i*this.num1);
            this.saida = this.saida + "\n" + this.num1 + " x " + i + " = " + (i * this.num1);
        }
        
        return saida;
    }
    
}
