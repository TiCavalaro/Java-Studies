/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov3Ex9;

import javax.swing.JOptionPane;

public class ClassificacaoVIEW {
    public static void main(String[] args) {
        ClassificacaoDTO classificacaoDTO = new ClassificacaoDTO();
        ClassificacaoDAO classificacaoDAO = new ClassificacaoDAO();
        
        try{
            classificacaoDTO.setAlt(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")));
            classificacaoDTO.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: ")));
            
            JOptionPane.showMessageDialog(null, classificacaoDAO.ClassificarPessoa(classificacaoDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
