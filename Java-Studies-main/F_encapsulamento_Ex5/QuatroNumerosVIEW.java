/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_Ex5;

import javax.swing.JOptionPane;

public class QuatroNumerosVIEW {
    public static void main(String[] args) {
        QuatroNumerosDTO quatronumerosDTO = new QuatroNumerosDTO();
        QuatroNumerosDAO quatronumerosDAO = new QuatroNumerosDAO();
        
        try{ 
            JOptionPane.showMessageDialog(null, "Informe os 3 primeiros números em ordem crescente!");
            
            quatronumerosDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")));
            quatronumerosDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: ")));
            quatronumerosDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: ")));
            quatronumerosDTO.setN4(Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto número: ")));
            
            JOptionPane.showMessageDialog(null, quatronumerosDAO.ordenarNumeros(quatronumerosDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " +e.getMessage());
        }
    }
    
}
