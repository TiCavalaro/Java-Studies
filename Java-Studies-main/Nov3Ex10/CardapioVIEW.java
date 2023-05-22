/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov3Ex10;

import javax.swing.JOptionPane;

public class CardapioVIEW {
    public static void main(String[] args) {
        CardapioDTO cardapioDTO = new CardapioDTO();
        CardapioDAO cardapioDAO = new CardapioDAO();
        
        int opc = 1;
        
        JOptionPane.showMessageDialog(null, "Código         Produto            Preço(R$)\n" +
                                            "• 1            Hamburger          1.50\n" +
                                            "• 2            Cheeseburger       1.80\n" +
                                            "• 3            Misto Quente       1.20\n" +
                                            "• 4            Americano          2.00\n" +
                                            "• 5            Queijo Prato       1.00");
        try{
            while(opc != 0){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar a compra ou digite 0 para sair: "));
            cardapioDTO.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto: ")));
            cardapioDTO.setQtd(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do item que deseja: ")));
            }
            JOptionPane.showMessageDialog(null, cardapioDAO.calculaPreco(cardapioDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}
