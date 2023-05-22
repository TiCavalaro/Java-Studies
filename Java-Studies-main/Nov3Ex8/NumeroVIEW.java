/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov3Ex8;
import javax.swing.JOptionPane;

public class NumeroVIEW {
    public static void main(String[] args) {
        NumeroDAO numeroDAO = new NumeroDAO();
        NumeroDTO numeroDTO = new NumeroDTO();
        
        try{ 
            
            numeroDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")));
            numeroDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: ")));
            numeroDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: ")));
            
            JOptionPane.showMessageDialog(null, numeroDAO.ordenarNumeros(numeroDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " +e.getMessage());
        }
        
    }
    
}
