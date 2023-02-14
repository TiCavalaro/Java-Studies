/*
FAÇA UM PROGRAMA QUE RECEBA N VALORES DE PESSOAS E MOSTRE O NOME E A ALTURA DE 
QUEM TEM A MAIOR ALTURA. PERGUNTE SE DESEHA CIBTUBYAR A ARECEBER NOVOS VALORES.
 */
package D_while_ex1;

import javax.swing.JOptionPane;

public class TestarAltura {
    private String nome, resposta, nomeMaior;
    private double alt, maiorAlt;
    private int contador = 0;
    
    public void calculaAltura(){
        
        do{
            this.nome = JOptionPane.showInputDialog("Digite o nome:");
            this.alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
            this.resposta = JOptionPane.showInputDialog("Digite 'S' para continuar ou 'N' para encerrar o programa: ");
            this.contador++;
            
            if(this.alt > this.maiorAlt){
                this.maiorAlt = this.alt;
                this.nomeMaior = this.nome;
            }
            
        }while(this.resposta.equalsIgnoreCase("S"));
    }
    
    public String mostrarValores(){
        return this.nomeMaior + " tem a maior altura com " + this.maiorAlt + "m.";
        
    }
    
}
