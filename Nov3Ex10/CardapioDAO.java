/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov3Ex10;

public class CardapioDAO {

    private double preco1, preco2, preco3, preco4, preco5, precoTotal;
    private int opc;

    public Double calculaPreco(CardapioDTO cardapioDTO) {

        while (opc != 0) {
            switch (cardapioDTO.getCod()) {
                case 1:
                    preco1 = cardapioDTO.getQtd() * 1.50;
                    break;
                case 2:
                    preco2 = cardapioDTO.getQtd() * 1.80;
                    break;
                case 3:
                    preco3 = cardapioDTO.getQtd() * 1.20;
                    break;
                case 4:
                    preco4 = cardapioDTO.getQtd() * 2;
                    break;
                case 5:
                    preco5 = cardapioDTO.getQtd() * 1;
                    break;
            }
        }
        
        return precoTotal = preco1 + preco2 + preco3 + preco4 + preco5;
    }

}
