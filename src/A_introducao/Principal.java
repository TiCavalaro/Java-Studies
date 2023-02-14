/*
 Faça um programa que receba três notas e seus respectivos pesos.
 Calcule e mostre a média ponderada dessas notas, para isso você deverá criar 
 um método com passagem de parâmetros.
 */
package A_introducao;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        //A classe MediaNoa é apenas um modelo 
        //para termos acesso ao seu processamento
        //temos que criar um objeto, exemplo:
        //NomeDaClasse nomeObjeto = new NomeDaClasse();
        MediaNota objMediaNota = new MediaNota();
        
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao Programa 2!");
        
        double n1, n2, n3, p1, p2, p3, media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
        p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a peso 2: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: "));
        p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a peso 3: "));
        
        media = objMediaNota.calculaMedia(n1, n2, n3, p1, p2, p3);
        
        JOptionPane.showMessageDialog(null, "Média: " + media);
        System.out.println("Média: " + media);
        
    }
    
}
