/*
FAÇA UM PROGRAMA QUE SOLICITE 10 NÚMEROS INTEIROS. AO FINAL, INFORME QUAL FOI 
O MAIOR E O MENOR NÚMERO.
OBS: DEVE SER CRIADO UM MÉTODO PARA VERIFICAR OS NÚMEROS E UM OUTRO APENAS
PARA MOSTRAR OS NÚMEROS ENCONTRADOS.
 */
package C_for_ex4;

import javax.swing.JOptionPane;

public class MaiorMenor {
    private int num, i, maior, menor;
    
    public void verificaNumero(int num, int i){
        this.num = num;
        this.maior = maior;
        this.menor = menor;
        this.i = i;
        
        if(i ==1){
            this.maior = this.num;
            this.menor = this.num;
        }else{
            if(this.num > this.maior){
                this.maior = this.num;
            }
            if(this.num < this.menor){
                this.menor = this.num;
            }
         }
    }
    
    public String mostrarNumero(){
        return "O maior número é: " + this.maior + "\nO menor número é: " + this.menor;
    }
}
