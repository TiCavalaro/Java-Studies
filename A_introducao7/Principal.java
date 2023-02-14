
package A_introducao7;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        OrdemCrescente ordemCrescente = new OrdemCrescente();
        
        int n1, n2, escolha;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha a ordem: \n1- Crescente \n2- Decrescente "));
        
        ordemCrescente.escolhaOrdem(n1, n2, escolha);
        
    }
}
