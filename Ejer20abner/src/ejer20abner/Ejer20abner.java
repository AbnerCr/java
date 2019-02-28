/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer20abner;

import java.util.Scanner;

/**
 *
 * @author Abner
 */
public class Ejer20abner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        
        char Mays[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++)
        {
            Mays[j] = (char) i;
        }   
        
        String cadena = "";
        int selct = -1;
        
        do
        {
            System.out.println("Ingrese un numero entre 0 y"+(Mays.length -1));
            selct = Integer.valueOf(entrada.next());
            
            if (!(selct >= 0 && selct <= Mays.length -1))
            {
                System.out.println("Error, ingrese otro numero");
            }
            else
            {
                if (selct != -1)
                {
                    cadena += Mays[selct];
                }
            }
        } while (selct != -1);
        System.out.println(cadena);

    }
    
}
