/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.time.Clock;

/**
 *
 * @author EPIS
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    float sumar( float a, float b){
        return a+b;
    }
    float resta( float a, float b){
        return a-b;
    }
    float multiplicacion( float a, float b){
        return a*b;
    }
    float division( float a, float b){
        if(b==0){
            System.out.println("no se puede dividir");
            return -1;
        }
        return a/b;
    }
    double potencia( double a, double b){
        return Math.pow(a, b);
    }
}
