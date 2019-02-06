/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author Abner
 */
public class Ejem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrar = new Scanner (System.in);
        int valor1 = 0;
        System.out.println("Ingrese un valor");
        //valor1 = entrar.next();
        valor1 = Integer.valueOf(entrar.next());
        
        float valor2 = (float)0.0;
        System.out.print("ingrese un valor:.");
        valor2=Float.valueOf(entrar.next());
        
        double valor3 = 0;
        System.out.println("ingrese un valor");
        valor3 = Double.valueOf(entrar.next());
        
    }
    
}
