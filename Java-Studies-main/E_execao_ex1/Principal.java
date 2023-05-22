
package E_execao_ex1;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();
        try{
        double numero, valor;
        
        numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número a ser dividido: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um número para o divisor: "));
        
        divisao.calculaDivisao(numero, valor);
        }
        catch(Exception e){
            System.out.println("Digite apenas números: " + e.getMessage());
        }
    }   
}
