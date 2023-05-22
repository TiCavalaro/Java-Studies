/*
FAÇA UM PROGRAMA QUE RECEBA UM VALOR INTEIRO DE 1 A 12 E MOSTRE QUAL É O 
RESPECTIVO MÊS DO ANO.
 */
package B_switch2;

public class Mes {
    private int num1;
    
    public String descobrirMes(int num1){
        this.num1 = num1;
        
        switch(num1){
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Opção Inválida!";
        }
    } 
}
