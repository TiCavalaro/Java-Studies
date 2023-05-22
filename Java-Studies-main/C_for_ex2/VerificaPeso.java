/*
O DONO DE UMA PROPRIEDADE RURAL POSSUI 10 BOIS E QUER VERIFICAR QUAL É O BOI QUE
POSSUI O MAIOR PESO. FAÇA UM PROGRAMA PARA MOSTRAR O NÚMERO DO BOI E O SEU PESO.
UTILIZE for().
*/
package C_for_ex2;

import javax.swing.JOptionPane;

public class VerificaPeso {
    private double peso, maiorPeso=0;
    private int numBoi;
    
    public String veriicaPeso(){
        this.peso = peso;
        this.maiorPeso = maiorPeso;
        this.numBoi = numBoi;
        
        for(int i=1; i<=5; i++){
            this.peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do boi " + i + ": "));
            if(this.peso > this.maiorPeso){
                this.maiorPeso = this.peso;
                this.numBoi = i;
            }
        }
        return "O boi " + this.numBoi + " tem o maior peso: " + this.maiorPeso + ".";
    }
}
