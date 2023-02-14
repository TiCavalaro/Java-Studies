/*
 VAMOS REEDITAR COM ALGUNS NOVOS MÉTODOS O CÓDIGO PARA CALCULAR A MÉDIA 
 ARITMÉTICA DE DUAS NOTAS.
 */
package A_introducao4;

import java.text.DecimalFormat;

/**
 *
 * @author Aluno
 */
public class CalculaMedia2 {
    DecimalFormat decimalFormat = new DecimalFormat("0.0");
    
    private double n1, n2, media;
    private String resposta;
    
    public void calcMedia(){
        this.media = (this.n1 + this.n2) / 2;
    }
    
    public void situacao(){
        if(this.media >= 6){
            resposta = "Aprovado";
        }
        else if ((this.media >= 4) && (this.media < 6)){
            resposta = "Aluno está de IFA";    
        }
        else{
            resposta = "Reprovado";
        }
    }
    
    public String calcula(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
        
        calcMedia();
        situacao();
        
        return "A nota do aluno é: " + decimalFormat.format(this.media) + ". \nE sua situação é: " + this.resposta + ".";
    }
    
}
