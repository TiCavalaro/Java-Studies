/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_for_ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        
        int num1;
        //OPÇÃO 1
        //num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para calcular a tabuada: "));
        //JOptionPane.showMessageDialog(null, tabuada.tabuada(num1));
        
        //OPÇÃO 2
        JOptionPane.showMessageDialog(null, tabuada.tabuada(Integer.parseInt(
                JOptionPane.showInputDialog("Informe um número para calcular a tabuada: "))));
    }
    
}
