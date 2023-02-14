/*
FAÇA UM PROGRAMA QUE CALCULE A ÁREA DE UM QUADRILÁTERO
-CRIE UM MÉTODO COM PASSAGEM DE PARÂMETRO MAS SEM RETORNO(VOID)
 */
package A_introducao10;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        AreaQuadrilatero areaQuadrilatero = new AreaQuadrilatero();
        
        int lado, area = 0;
        
        lado = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do lado: "));
        
        areaQuadrilatero.calculaArea(lado, area);
        
    }
    
}
