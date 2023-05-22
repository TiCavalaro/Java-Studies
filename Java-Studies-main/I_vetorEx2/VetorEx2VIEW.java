/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_vetorEx2;

import javax.swing.JOptionPane;

public class VetorEx2VIEW {
    public static void main(String[] args) {
        int [] n1 = new int[6];
        
        VetorEx2DAO vetorex2DAO = new VetorEx2DAO();
        VetorEx2DTO vetorex2DTO = new VetorEx2DTO();
        
        for(int i=1; i<=6; i++){
            n1[1] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota " + i + ": "));
        }
        
        vetorex2DTO.setVetor(n1);
        
        JOptionPane.showMessageDialog(null, vetorex2DAO.imprimeVetor(vetorex2DTO));
    }
    
}
