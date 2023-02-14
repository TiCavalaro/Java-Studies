/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_for_ex3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        CalculaMedia calculamedia = new CalculaMedia();
        
        double nota;
        
        JOptionPane.showMessageDialog(null, calculamedia.calculaMedia());
    }
    
}
