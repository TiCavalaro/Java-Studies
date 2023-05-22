/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_for_ex2;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        VerificaPeso verificapeso = new VerificaPeso();
        
        
        JOptionPane.showMessageDialog(null, verificapeso.veriicaPeso());
    }
    
}
