/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosAbner;

import java.util.Scanner;

/**
 *
 * @author Abner
 */
public class Ejercicios01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        
        System.out.print("Ingresa un numero:.");
        num = Integer.valueOf(entrada.next());
        
        if(num >= 0 && num <=9999){
            if(num >= 0 && num <= 9){
                System.out.println("El numero:. "+num+" tiene 1 cifra");
            }
            else if(num >= 10 && num <=99){
                System.out.println("El numero:. "+num+" tiene 2 cifras");
            }
            else if(num >= 100 && num <=999){
                System.out.println("El numero:. "+num+" tiene 3 cifras");
            }
            else if(num >= 1000 && num <=9999){
                System.out.println("El numero:. "+num+" tiene 4 cifras");
            }
            
        }else{
            System.out.println("Valor no valido .");
        }
            
        
    }
    
}
