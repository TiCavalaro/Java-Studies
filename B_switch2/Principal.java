/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_switch2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        Mes mes = new Mes();
        
        int num1;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número de 1 à 12 para descobrir o mês: "));
        
        JOptionPane.showMessageDialog(null, mes.descobrirMes(num1));
    }
    
}
