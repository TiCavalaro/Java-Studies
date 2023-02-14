/*
FAÇA UM PROGRAMA QUE RECEBA 4 NOTAS E CALCULE A MEDIA. DEPOIS AVISE SE O ALUNO ESTÁ APROVADO OU REPROVADO.
 */
package C_for_ex3;

import javax.swing.JOptionPane;

public class CalculaMedia {
    private double nota, media;
    private double somaNota = 0;
    
    public String calculaMedia(){
        this.nota = nota;
        this.media = media;
        
        for(int i=1; i<=4; i++){
            this.nota = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da nota " + i + ": "));
            this.somaNota = this.somaNota + this.nota;
            this.media = this.somaNota / 4;
        }
        if(this.media >= 6){
            return "A média é: " + this.media + "\nAprovado";
        }else{
            return "A média é: " + this.media + "\nReprovado";
        }
            
    }
}
