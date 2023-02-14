/*
FAÇA UM PROGRAMA QUE RECEBA DOIS NÚMERO REAIS.
-CRIE UM MÉTODO PARA MOSTRAR A DIVISÃO DOS DOIS NÚMEROS
-CRIE UM MÉTODO PARA MOSTRAR A MULTIPLICAÇÃO ENTRE OS DOIS NÚMEROS
CRIE OS MÉTODOS COM PASSAGEM DE PARÂMETROS E COM RETORNO DO TIPO REAL.
*/
package A_introducao8;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        Calculos calculos = new Calculos();
        
        double n1, n2, resultado = 0;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do segundo número: "));
        
        calculos.divisao(n1, n2, resultado);
        calculos.multiplicacao(n1, n2, resultado);
    }
    
}
