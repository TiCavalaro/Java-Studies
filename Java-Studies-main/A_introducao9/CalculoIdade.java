/*
FAÇA UM PROGRAMA QUE CALCULE A IDADE DE UMA PESSOA A PARTIR DO ANO DE NASCIMENTO.
PARA ISSO CRIE UM MÉTODO QUE FAÇA O CALCULO, SEM PASSAGEM DE PARÂMETRO E SEM RETORNO.
 */
package A_introducao9;

import javax.swing.JOptionPane;


public class CalculoIdade {
    int anonasc, idade;
    
    public void calcularIdade(){
        this.anonasc = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano de nascimento: "));
        
        this.idade = 2022 - this.anonasc;
        
        System.out.println("Sua idade é: " + this.idade + " anos.");
    }
    
}
