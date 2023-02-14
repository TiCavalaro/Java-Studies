/*
 Vamos criar uma classe para receber o valor do salário atual de um funcionário
 e aplica um aumento de X%(Digitado pelo usuário)
 */
package A_introducao3;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String args[]){
        
        SalarioNovo objSalarioNovo = new SalarioNovo();
        
        JOptionPane.showMessageDialog(null, "O novo salário é: " + 
                objSalarioNovo.calculaSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário: ")), 
                                              Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem de aumento do salário: "))));
        
        //double salario, porcentagemAumento, NovoSalario;
        
        //salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do salário: "));
        //porcentagemAumento = Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem de aumento do salário: "));
        
        //NovoSalario = objSalarioNovo.calculaSalario(salario, porcentagemAumento);
        
        //JOptionPane.showMessageDialog(null, "O novo salário do funcionário é: " + NovoSalario);
    }
    
}
