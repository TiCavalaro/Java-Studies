/*
 Faça um programa que receba duas notas e receba a média aritmética
 */
package A_introducao4;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        
        MediaNota objMediaNota = new MediaNota();
        
        double media, n1, n2;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
        
        media = objMediaNota.calculaMedia(n1, n2);
        
        JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);
        
    }
    
}
