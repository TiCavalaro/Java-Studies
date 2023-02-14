/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_for_ex5;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        IncrementaNumero incrementanumero = new IncrementaNumero();
        
        int maior = 0, menor = 0, i = 0;
        
        JOptionPane.showMessageDialog(null, incrementanumero.mostrarNumeros());
        
    }    
}
