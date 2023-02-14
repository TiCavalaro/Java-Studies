/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_while_ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        TestarAltura testarAltura = new TestarAltura();
        
        testarAltura.calculaAltura();
        
        JOptionPane.showMessageDialog(null, testarAltura.mostrarValores());
    }
    
}
