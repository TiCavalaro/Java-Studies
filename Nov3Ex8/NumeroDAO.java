/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov3Ex8;

public class NumeroDAO {
    
    public String ordenarNumeros(NumeroDTO numeroDTO){
        
        if((numeroDTO.getN1() > numeroDTO.getN2()) && (numeroDTO.getN2() > numeroDTO.getN3())){
            return "A ordem crescente dos números é: " + numeroDTO.getN3() + ", " + numeroDTO.getN2() + ", " + numeroDTO.getN1();
        }else if((numeroDTO.getN2() > numeroDTO.getN1()) && (numeroDTO.getN1() > numeroDTO.getN3())){
            return "A ordem crescente dos números é: " + numeroDTO.getN3() + ", " + numeroDTO.getN1() + ", " + numeroDTO.getN2();
        }else if((numeroDTO.getN1() > numeroDTO.getN3()) && (numeroDTO.getN3() > numeroDTO.getN2())){
            return "A ordem crescente dos números é: " + numeroDTO.getN2() + ", " + numeroDTO.getN3() + ", " + numeroDTO.getN1();
        }else if((numeroDTO.getN3() > numeroDTO.getN1()) && (numeroDTO.getN1() > numeroDTO.getN2())){
            return "A ordem crescente dos números é: " + numeroDTO.getN2() + ", " + numeroDTO.getN1() + ", " + numeroDTO.getN3();
        }else if((numeroDTO.getN3() > numeroDTO.getN2()) && (numeroDTO.getN2() > numeroDTO.getN1())){
            return "A ordem crescente dos números é: " + numeroDTO.getN1() + ", " + numeroDTO.getN2() + ", " + numeroDTO.getN3();
        }else if((numeroDTO.getN2() > numeroDTO.getN3()) && (numeroDTO.getN3() > numeroDTO.getN1())){
            return "A ordem crescente dos números é: " + numeroDTO.getN1() + ", " + numeroDTO.getN3() + ", " + numeroDTO.getN2();
        }
        
        return "";
    }
    
}
