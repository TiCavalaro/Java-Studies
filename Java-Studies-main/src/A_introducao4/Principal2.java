/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introducao4;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal2 {
    public static void main(String[] args) {
        CalculaMedia2 calculaMedia2 = new CalculaMedia2();
        
        JOptionPane.showMessageDialog(null, calculaMedia2.calcula
            (Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")), 
                    Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "))));
    }
    
}
