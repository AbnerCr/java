/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_33;

import java.util.Scanner;

/**
 *
 * @author Abner 
 */
public class e26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        System.out.println("ingrese un numero");
        num = Integer.valueOf(entrada.next());
        System.out.println("ingrese un segundo numero");
        num1 = Integer.valueOf(entrada.next());
        System.out.println("ingrese un tercer numero");
        num2 = Integer.valueOf(entrada.next());
        
        
        int suma = (num+num1+num2);
        int resta = (num-num1-num2);
        int multi = (num*num1*num2);
        if (suma > 0 && resta > 0 && multi > 0){
            System.out.println("la suma es "+suma);
            System.out.println("la resta es "+resta);
            System.out.println("la multipĺicacion es "+multi);

        }
        else{
            System.out.println("los numeros son negativos");
        }
    }
    
}
