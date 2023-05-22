/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_vetor;

import javax.swing.JOptionPane;

public class VetorVIEW {
    public static void main(String[] args) {
        int [] n1 = new int[5];
        
        VetorDAO vetorDAO = new VetorDAO();
        VetorDTO vetorDTO = new VetorDTO();
        
        for(int i=0; i<=4; i++){
            n1[1] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
        }
        
        vetorDTO.setVetor(n1);
        
        JOptionPane.showMessageDialog(null, vetorDAO.imprimeVetor(vetorDTO));
    }
}
