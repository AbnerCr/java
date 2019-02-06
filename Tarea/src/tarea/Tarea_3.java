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
public class Tarea_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int decision = 0;
        float quetzales = 0;
        float Dolares = 0;
        float valor_quetzales = 0;
        float total_quetzales = 0;
        float total = 0;
        System.out.println("Convertir dolares a quetzales (1) \n Convertir quetzales a dolares (2) ");
        decision = entrada.nextInt();
        
        if (decision == 1)
        {
            System.out.println("Ingrese la cantidad de dolares");
            Dolares = entrada.nextFloat();
            System.out.println("Ingresa precio de dolar");
            valor_quetzales = entrada.nextFloat();
            total_quetzales = Dolares*valor_quetzales;
            System.out.println("El total en quetzales es:."+ total_quetzales);
        }
        else if (decision ==2)
        {
            System.out.println("Convertir cantidad de quetzales a dolares");
            System.out.println("Ingrese precio del dolares:.");
            Dolares = entrada.nextFloat();
            System.out.println("Ingrese cantidad en quetzales");
            quetzales = entrada.nextFloat();
            total = (quetzales/Dolares);
            System.out.println("La cantidad en dolares es:."+total);
        }
        else 
        {
            System.out.println("Decision no correcta");
        }
        
    }
    
}
