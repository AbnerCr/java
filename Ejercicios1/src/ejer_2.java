
import java.awt.BorderLayout;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abner
 */
public class ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
       
        String numero = "";
        String numero_al_revez = "";
        
         System.out.println("Ingrese un numero ");
        numero = entrada.next();
        
        for (int i = numero.length() -1; i >= 0 ; i--)
            numero_al_revez = numero_al_revez + numero.charAt(i);
        System.out.println(numero_al_revez);        
    }
}    
    

