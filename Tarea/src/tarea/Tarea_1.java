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
public class Tarea_1 {       


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        float quetzales = 0;
        float Dolares = 0;
        float vuelto = 0;
        System.out.println("Cantidad de dinero Q:.");
        quetzales = entrada.nextFloat();
        System.out.println("Valor en dolares");
        Dolares = entrada.nextFloat();
        float Dolar;
        
        vuelto = (quetzales/Dolares);
        
        System.out.println("en dolares es:"+vuelto);
    }
    
}
