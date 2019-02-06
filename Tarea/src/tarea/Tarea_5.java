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
public class Tarea_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String Producto = "";
        float Total = 0;
        float Precio = 0;
        
        while (Precio>=0)
        {
            System.out.println("Ingrese producto:.");
            Producto = entrada.next();
            System.out.println("Ingrese precio de product");
            Precio = entrada.nextFloat();
            
            if (Precio >=1)
            {
                Total = (Total+Precio);
            }
        }
        System.out.println("El total es:."+ Total);
        if (Total >= 1500)
        {
            System.out.println("Con descuento es:."+(Total*0.1));
        }
        else if (Total>=500)
        {
            System.out.println("Con descuento es:."+(Total*0.05));
        }
    }
    
}
