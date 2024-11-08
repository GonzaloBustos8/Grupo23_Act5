
package com.mycompany.tptest;

/**
 *
 * @author Becky
 */
public class Calculador {
    public double sumar(double n1, double n2){
        return n1 + n2;
    }
    public double restar(double n1, double n2){
        return n1 - n2;
    }
    public int multiplicar(int n1, int n2){
        return n1 * n2;
    }
    public int dividir(int n1, int n2){
         if (n2 == 0|| n1==0) {
        throw new ArithmeticException("No se puede dividir entre cero");
    }else if (n1 < n2){
             return n2 / n1;
            }else{
            return n1/n2;
        }
    }    
}
    
