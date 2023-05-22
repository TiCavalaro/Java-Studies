/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_switch1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();
        
        int opcao, num1, num2;
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite qual operação deseja: \n1 - Soma \n2 - Subtração"));
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do segundo número: "));
        
        JOptionPane.showMessageDialog(null, operacao.calcular(opcao, num1, num2));
    }
    
}
