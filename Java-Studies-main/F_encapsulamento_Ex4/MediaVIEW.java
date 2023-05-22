/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_Ex4;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class MediaVIEW {
    public static void main(String[] args) {
        MediaDTO mediaDTO = new MediaDTO();
        MediaDAO mediaDAO = new MediaDAO();
        
        try{
            
            mediaDTO.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: ")));
            mediaDTO.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: ")));
            
            JOptionPane.showMessageDialog(null, mediaDAO.calculaMedia(mediaDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " +e.getMessage());
        }
    }
    
}
