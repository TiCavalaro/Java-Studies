/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_for_ex4;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        MaiorMenor maiormenor = new MaiorMenor();
        
        int num = 0, i;
         
        for(i=1; i<=10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            maiormenor.verificaNumero(num, i);
        }
        
        JOptionPane.showMessageDialog(null, maiormenor.mostrarNumero());
    }
    
}
